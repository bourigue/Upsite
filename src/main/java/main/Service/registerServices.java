/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.Service;

import java.util.List;
import main.Entity.User;
import main.Util.HibernateUtil;
import org.hibernate.Session;
import main.Repository.registerDao;
import main.Repository.registerDaoImp;

/**
 *
 * @author rrbou
 */
public class registerServices {

  registerDao registerDaoImp=new registerDaoImp();
  
  public void addUser(User user){
            registerDaoImp.addUser(user);
  }
  
  
    
}
