package fr.midix.services.boireverre.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.osoa.sca.annotations.Service;

@Service
public interface RendezVousManagerItf {

	  @POST
	  @Path("/createRDV")
	  @Produces("text/plain")
	  void createRDV(@FormParam("idPlace")long idPlace,@FormParam("creatorUser")long creatorUser,@FormParam("nbUser")int nbUser,@FormParam("minAge") int minAge,@FormParam("maxAge")int maxAge,@FormParam("date")String date);

	  @GET
	  @Path("/init")
	  @Produces("text/plain")
	  void init();
}
