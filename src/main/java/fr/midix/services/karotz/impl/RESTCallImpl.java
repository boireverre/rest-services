package fr.midix.services.karotz.impl;

import org.osoa.sca.annotations.Scope;

import fr.midix.services.karotz.api.RESTCall;
import fr.midix.services.karotz.model.SendMail;

@Scope("COMPOSITE")
public class RESTCallImpl implements RESTCall {

	public void sendMail(String sender) {
		SendMail.sendMail(sender);
	}

}
