package fr.midix.services.boireverre.impl;

import javax.persistence.EntityManager;

import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Scope;

import fr.midix.services.boireverre.api.RendezVousManagerItf;
import fr.midix.services.boireverre.model.MyDate;
import fr.midix.services.boireverre.model.Place;
import fr.midix.services.boireverre.model.RendezVous;
import fr.midix.services.boireverre.model.User;
import fr.midix.services.common.Provider;

@Scope("COMPOSITE")
public class RendezVousManager implements RendezVousManagerItf {

	@Reference
	protected Provider<EntityManager> db;
	
	public void createRDV(long idPlace, long creatorUser, int nbUser,
			int minAge, int maxAge, String date) {
		EntityManager em = db.get();
		Place place = em.find(Place.class, idPlace);
		User user = em.find(User.class, creatorUser);
		RendezVous rdv = new RendezVous(place, nbUser, MyDate.convertStringToMyDate(date), minAge, maxAge, user);
		em.persist(rdv);
	}

	public void init() {
		EntityManager em = db.get();
	}


}
