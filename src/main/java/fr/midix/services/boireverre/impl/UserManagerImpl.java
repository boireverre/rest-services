package fr.midix.services.boireverre.impl;

import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.json.simple.JSONObject;
import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Scope;

import fr.midix.services.boireverre.api.UserManagerItf;
import fr.midix.services.boireverre.model.User;
import fr.midix.services.common.PasswordManager;
import fr.midix.services.common.Provider;

@Scope("COMPOSITE")
public class UserManagerImpl implements UserManagerItf {

	@Reference
	protected Provider<EntityManager> db;

	@Override
	public long createUser(String login, String password, String mail,
			String birthday) {
		EntityManager em = db.get();
		password = PasswordManager.cryptPassword(password);
		em.getTransaction().begin();
		boolean existsId = true;
		int START = 1000000;
		int END = 9999999;
		long id = 0;
		while (existsId) {
			Random random = new Random();
			id = getRandom(START, END, random);
			if (em.find(User.class, id) == null) {
				existsId = false;
			}
		}
		User user = new User(id, login, password, mail, birthday);
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		return id;
	}

	private static long getRandom(int aStart, int aEnd, Random aRandom) {
		long range = (long) aEnd - (long) aStart + 1;
		long fraction = (long) (range * aRandom.nextDouble());
		return (fraction + aStart);
	}

	@Override
	public long connect(String login, String password) {
		try {
			String encryptedPass = PasswordManager.cryptPassword(password);
			EntityManager entityManager = db.get();
			Query query = entityManager
					.createQuery("SELECT u FROM User u WHERE u.login = :login AND u.password = :password");
			query.setParameter("login", login);
			query.setParameter("password", encryptedPass);
			User user = (User) query.getSingleResult();
			return user.getId();
		} catch (Exception nre) {
			return 0;
		}
	}

	@Override
	public boolean checkLoginExists(String login) {
		try {
			EntityManager entityManager = db.get();
			Query query = entityManager
					.createQuery("SELECT u FROM User u WHERE u.login = :login");
			query.setParameter("login", login);
			User user = (User) query.getSingleResult();
			return user!=null;
		} catch (Exception nre) {
			return true;
		}
	}

	@Override
	public String getUserProfile(String id) {
		Long idLong = Long.parseLong(id);
		try {
			EntityManager entityManager = db.get();
			User user = entityManager.find(User.class, idLong);
			return transformUserToJson(user);
		} catch (Exception nre) {
			return "";
		}
	}

	@SuppressWarnings("unchecked")
	private String transformUserToJson(User user){
		JSONObject userJson = new JSONObject();
		userJson.put("login", user.getLogin());
		userJson.put("mail", user.getMail());
		userJson.put("birthday", user.getBirthday());
		return userJson.toJSONString();
	}

	@Override
	public void modifyUserProfile(String id, String mail, String birthday) {
		Long idLong = Long.parseLong(id);
		EntityManager entityManager = db.get();
		try {
			entityManager.getTransaction().begin();
			User user = entityManager.find(User.class, idLong);
			user.setMail(mail);
			user.setBirthday(birthday);
			entityManager.persist(user);
			entityManager.getTransaction().commit();
		} catch (Exception nre) {
			entityManager.getTransaction().rollback();
		}
	}
}
