var myMessages = [ 'info', 'warning', 'error', 'success' ];
var current;

$(document).ready(function() {
	$('input').each(function() {
		var default_value = this.value;
		$(this).focus(function() {
			if (this.value == default_value) {
				this.value = '';
			}
		});
		$(this).blur(function() {
			if (this.value == '') {
				this.value = default_value;
			}
		});
	});
});

function initMap() {
	if (navigator.geolocation) {
		navigator.geolocation.getCurrentPosition(displayMyPosition,
				errorPosition);
	} else {
		// Pas de support, proposer une alternative ?
	}
}

function displayMyPosition(position) {
	displayMap(position.coords.longitude, position.coords.latitude);
}

function errorPosition(error) {
	switch (error.code) {
	case error.TIMEOUT:
		alert("Timeout !");
		break;
	case error.PERMISSION_DENIED:
		alert("Vous n’avez pas donné la permission pour vous localiser");
		break;
	case error.POSITION_UNAVAILABLE:
		alert("La position n’a pu être déterminée");
		break;
	case error.UNKNOWN_ERROR:
		alert("Erreur inconnue");
		break;
	}
}

function displayMap(lon, lat) {
	var map, layer;
	map = new OpenLayers.Map('basicMap', {
		controls : [ new OpenLayers.Control.MouseDefaults() ]
	});
	map.addLayer(new OpenLayers.Layer.OSM());

	var lonLat = new OpenLayers.LonLat(lon, lat).transform(
			new OpenLayers.Projection("EPSG:4326"), // transform from WGS 1984
			map.getProjectionObject() // to Spherical Mercator Projection
	);

	var zoom = 16;

	var markers = new OpenLayers.Layer.Markers("Markers");
	map.addLayer(markers);
	var marker = new OpenLayers.Marker(lonLat);
	markers.addMarker(marker);
	var ol_wms = new OpenLayers.Layer.WMS("OpenLayers WMS",
			"http://labs.metacarta.com/wms/vmap0?", {
				layers : 'basic'
			});
	var feature = new OpenLayers.Feature(markers, lonLat);

	map.setCenter(lonLat, zoom);
	marker.events.register("mousedown", marker, mousedown);
	// Gestion des evenements
	function mousedown(evt) {
		popup = feature.createPopup(true);
		popup.setContentHTML("Exemple de PopUp sur un marqueur");
		popup.setBackgroundColor("yellow");
		popup.setOpacity(0.6);
		markers.map.addPopup(popup);
	}
}

function initConnectionButtons() {
	$("#connect-button")
			.click(
					function() {
						$
								.get(
										"/user/connect",
										{
											login : $("#login").val(),
											password : $("#password").val()
										},
										function(data) {
											var id = eval(data);
											if (data == 0) {
												showMessage(
														"error",
														"Impossibilité de vous connecter!",
														"Ce compte n'existe pas ou le mot de passe est incorrect.");
											} else {
												sessionStorage.setItem(
														'userId', data);
												$(location).attr('href',
														"index.html");
											}
										});
					});

	$("#create-account").click(function() {
		$(location).attr('href', "createAccount.html");
	});
}

function hideAllMessages() {
	var messagesHeights = new Array(); // this array will store height for each

	for (i = 0; i < myMessages.length; i++) {
		if (myMessages[i] != current) {
			$('#' + myMessages[i] + "-message").css('display', 'none');
		}
	}
}

function showMessage(type, title, message) {
	current = type;
	$('#' + type + '-message > h3').html(title);
	$('#' + type + '-message > p').html(message);
	$('#' + type + '-message').css("display", "block");
	$('#' + type + '-message').click(function() {
		hideMessage(type);
	});
}

function hideMessage(type) {
	$('#' + type + "-message").css('display', 'none');
}

function checkEmail(email) {
	var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	return filter.test(email);
}

function checkDate(date){
	var filter = /^(\d{2})\/(\d{2})\/(\d{4})$/;
	return filter.test(date);
}
