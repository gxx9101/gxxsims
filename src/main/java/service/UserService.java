package service;

import java.util.List;

import domain.User;

public interface UserService {
   public List<User> findalluser();
   public void deleteuser(int userid);
   public void insertuser(User user);
   public List<User> finduser(String username);
} 
