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

    public User() {
    }

    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
    
}
