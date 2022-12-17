/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.Repository;

import java.util.List;
import main.Entity.User;
import main.Util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author rrbou
 */
public  class registerDaoImp implements registerDao{
Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public void addUser(User user) {
        
      session.beginTransaction();
      session.save(user);
      session.getTransaction().commit();
      
    }

    @Override
    public void deleteUser(User user) {
      session.beginTransaction();
      session.delete(user);
      session.getTransaction().commit();
      
    }

    @Override
    public User updateUser(User user) {
      session.beginTransaction();
      User u=(User)session.merge(user);
      session.getTransaction().commit();
      return u;   
    }

    @Override
    public User getUserBy(User user) {
      session.beginTransaction();
      session.update(user);
      session.getTransaction().commit();
      return user;   
    }

    @Override
    public List<User> findAll() {
      return session.createQuery(" select user from User").list();

    }
   
  
}
