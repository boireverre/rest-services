package fr.midix.services.boireverre.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.osoa.sca.annotations.Service;

@Service
public interface UserManagerItf {

	@POST
	@Path("/createUser")
	@Produces("text/plain")
	long createUser(@FormParam("login")String login, @FormParam("password")String password, @FormParam("mail")String mail, @FormParam("birthday")String birthday);
	
	@GET
	@Path("/connect")
	@Produces("text/plain")
	long connect(@FormParam("login")String login, @FormParam("password")String password);
	
	@GET
	@Path("/checkLoginExists")
	@Produces("text/plain")
	boolean checkLoginExists(@FormParam("login")String login);
	
	@GET
	@Path("/userProfile")
	@Produces("text/plain")
	String getUserProfile(@FormParam("id")String id);
	
	@POST
	@Path("/modifyProfile")
	@Produces("text/plain")
	void modifyUserProfile(@FormParam("id")String id,@FormParam("mail")String mail, @FormParam("birthday")String birthday);
	
}
