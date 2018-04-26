package dao;

import java.util.List;

import domain.User;

public interface Userdao {
	public int adduser(User user);
    public User isuser(String username ,String password);
    public List<User> findalluser();
}
