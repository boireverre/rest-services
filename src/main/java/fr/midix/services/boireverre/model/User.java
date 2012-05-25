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
    private String town;
    private String password;
    private MyDate birthday;
    
    public User() {
    }

    public User(long id, String login,String password, String town, MyDate birthday){
    	this.id = id;
    	this.login = login;
    	this.town = town;
    	this.birthday = birthday;
    	this.password = password;
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

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
    
    public String getPassword() {
		return password;
	}
    
    public void setPassword(String password) {
		this.password = password;
	}
    
}
