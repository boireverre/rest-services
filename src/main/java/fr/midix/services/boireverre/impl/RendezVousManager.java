package fr.midix.services.boireverre.impl;

import javax.persistence.EntityManager;

import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Scope;

import fr.midix.services.boireverre.api.RendezVousManagerItf;
import fr.midix.services.common.Provider;

@Scope("COMPOSITE")
public class RendezVousManager implements RendezVousManagerItf {

	@Reference
	protected Provider<EntityManager> db;
	
	public void createRDV(long idPlace, long creatorUser, int nbUser,
			int minAge, int maxAge, String date) {
		EntityManager em = db.get();
		
	}

	public void init() {
		EntityManager em = db.get();
	}


}
