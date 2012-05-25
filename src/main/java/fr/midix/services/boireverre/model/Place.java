package fr.midix.services.boireverre.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.code.geocoder.Geocoder;
import com.google.code.geocoder.GeocoderRequestBuilder;
import com.google.code.geocoder.model.GeocodeResponse;
import com.google.code.geocoder.model.GeocoderRequest;
import com.google.code.geocoder.model.GeocoderResult;

/**
 *
 * @author midix
 */
@Entity
@Table(name = "Place")
public class Place implements Serializable{
  
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private long id;
    private String name;
    private String address;
    private float latitude;
    private float longitude;
    
    public Place() {
    }

    public Place(String name, String address){
    	this.name = name;
    	this.address = address;
    	final Geocoder geocoder = new Geocoder();
    	GeocoderRequest geocoderRequest = new GeocoderRequestBuilder().setAddress(address+", France").setLanguage("en").getGeocoderRequest();
    	GeocodeResponse geocoderResponse = geocoder.geocode(geocoderRequest);
    	List<GeocoderResult> results = geocoderResponse.getResults();
    	if(results.size()>0){
    		this.latitude = results.get(0).getGeometry().getLocation().getLat().floatValue();
    		this.longitude = results.get(0).getGeometry().getLocation().getLng().floatValue();
    	}
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
    
    
}
