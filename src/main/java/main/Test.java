/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import main.Entity.User;
import java.util.Date;
import main.Service.registerServices;
 

 
public class Test {
    public static void main(String[] args) {
        registerServices registerServices = new registerServices();                                                                            
        User user = new User();
        user.setId(0L);
        user.setUsername("Mukesh");
        user.setCreatedBy("Google");
        user.setCreatedDate(new Date());
        registerServices.addUser(user);
    }
 
}
