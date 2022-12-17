package main.Repository;
import java.util.List;
import main.Entity.User;


public interface registerDao {
    
  public void addUser(User user);
  public void deleteUser(User user);
  public User updateUser(User user);
  public User getUserBy(User user);
  public List<User> findAll();
    
}
