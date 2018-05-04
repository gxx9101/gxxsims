package service;

import java.util.List;

import org.springframework.stereotype.Service;

import dao.Userdaoimpl;
import domain.User;
@Service
public class UserServiceimpl implements UserService{
   public List<User> findalluser(){
	   Userdaoimpl impl=new Userdaoimpl();
	   List<User> userlist=impl.getAll();
	   return userlist;
   }
   
   public void deleteuser(int userid){
	   Userdaoimpl impl=new Userdaoimpl();
	   impl.deleteuser(userid);
   }

public void insertuser(User user) {
	   Userdaoimpl impl=new Userdaoimpl();
	   impl.insertuser(user);
}

public List<User> finduser(String username) {
	   Userdaoimpl impl=new Userdaoimpl();
	  List<User> userlist= impl.finduser(username);
	return userlist;
}
}
