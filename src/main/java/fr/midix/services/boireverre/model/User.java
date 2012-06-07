package fr.midix.services.boireverre.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author midix
 */
@Entity
@Table(name = "User")
public class User implements Serializable{
    
    @Id
    private long id;
    private String login;
    private String password;
    private String birthday;
    private String mail;
    
    public User() {
    }

    public User(long id, String login,String password, String mail, String birthday){
    	this.id = id;
    	this.login = login;
    	this.birthday = birthday;
    	this.password = password;
    	this.mail = mail;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
    
    public String getPassword() {
		return password;
	}
    
    public void setPassword(String password) {
		this.password = password;
	}
    
    public String getMail() {
		return mail;
	}
    
    public void setMail(String mail) {
		this.mail = mail;
	}
}
