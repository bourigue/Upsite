
package main.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYE")
public class Emloye implements  Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    String nom;
    String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

   

    public Emloye() {
    }
    

    public Emloye(int id, String nom,String username) {
        this.id = id;
        this.nom = nom;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
