package main.Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

/*
  Created by marcus on 28/06/2015.
 */
@ManagedBean(name = "index")
@RequestScoped
public class IndexView {


   public void print(ActionEvent e){
  
   }
    public IndexView(){
    }

   private String username;
    private String password;

  

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
