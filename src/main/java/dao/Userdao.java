package dao;

import java.util.List;

import domain.User;

public interface Userdao {
	public int adduser(User user);
    public User isuser(String username ,String password);
    public List<User> findalluser();
    public List<User> getAll();
    public void deleteuser(int userid);
    public void insertuser(User user);
    public List<User> finduser(String username);
}
