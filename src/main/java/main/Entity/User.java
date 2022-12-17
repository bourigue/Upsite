/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.Entity;

/**
 *
 * @author rrbou
 */
import jakarta.persistence.Entity;
import java.util.Date;
 


import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="User")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

   
    private String username;
    private String password;
    private String createdBy;
    private Date createdDate;
    
     public void setId(Long  id) {
        this.id = id;
    }

   
    public String getPassword() {
        return password;
    }
  public void setPassword(String password) {
        this.password = password;
    }

    public Long  getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getCreatedBy() {
        return createdBy;
    }
 
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
 
    public Date getCreatedDate() {
        return createdDate;
    }
 
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

 
  

 
}