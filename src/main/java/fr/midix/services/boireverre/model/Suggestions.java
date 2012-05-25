package fr.midix.services.boireverre.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Suggestions")
public class Suggestions implements Serializable{

	@Id
	@GeneratedValue
    private long id;
	
	private User user;
	private String message;
	
	public Suggestions() {
	}
	
	public Suggestions(User user, String message){
		this.user = user;
		this.message = message;
	}
}
