package fr.midix.services.karotz.model;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class SendMail {

	public static void sendMail(String sender) {
		String from = null;
		String to = null;
		String password = null;
		if(sender.equals("Geraldine")){
			from = "geraldine.flament@gmail.com";
			to = "michel.dirix@gmail.com";
			password = "chocolat5";
		}
		else if(sender.equals("Michel")){
			from = "michel.dirix@gmail.com";
			to = "geraldine.flament@gmail.com";
			password = "#MD14031987#";
		}
		try {
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator(from,
					password));
			email.setTLS(true);
			email.setFrom(from);
			email.setSubject("Notification Karotz");
			email.setMsg("Je suis arriv&eacute;");
			email.addTo(to);
			email.send();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
