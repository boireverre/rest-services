package fr.midix.services.karotz.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.osoa.sca.annotations.Service;

@Service
public interface RESTCall {

	  @POST
	  @Path("/sendMail")
	  @Produces("text/plain")
	  void sendMail(@FormParam("sender")String sender);
}
