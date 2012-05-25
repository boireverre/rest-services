package fr.midix.services.boireverre.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.osoa.sca.annotations.Service;

@Service
public interface UserManagerItf {

	@POST
	@Path("/createUser")
	@Produces("text/plain")
	long createUser(@FormParam("login")String login, @FormParam("password")String password, @FormParam("town")String town, @FormParam("birthday")String birthday);
}
