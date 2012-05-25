package fr.midix.services.boireverre.impl;

import java.util.Random;

import javax.persistence.EntityManager;

import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Scope;

import fr.midix.services.boireverre.api.UserManagerItf;
import fr.midix.services.boireverre.model.MyDate;
import fr.midix.services.boireverre.model.User;
import fr.midix.services.common.Provider;

@Scope("COMPOSITE")
public class UserManagerImpl implements UserManagerItf {

	@Reference
	protected Provider<EntityManager> db;
	
	@Override
	public long createUser(String login, String password, String town, String birthday) {
		EntityManager em = db.get();
		boolean existsId = true;
		int START = 1000000;
	    int END = 9999999;
	    long id = 0;
	    while(existsId){
	    	Random random = new Random();
	    	id = getRandom(START, END, random);
	    	if(em.find(User.class, id) == null){
	    		existsId = false;
	    	}
	    }
        MyDate birthdayDate = MyDate.convertStringToMyDate(birthday);
        User user = new User(id, login, password, town, birthdayDate);
        em.persist(user);
        return id;
	}

	private static long getRandom(int aStart, int aEnd, Random aRandom){
	    long range = (long)aEnd - (long)aStart + 1;
	    long fraction = (long)(range * aRandom.nextDouble());
	    return (fraction + aStart);    
	  }
	
	
	
}
