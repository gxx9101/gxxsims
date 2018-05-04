package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.User;
import service.UserServiceimpl;

@Controller
public class UserController {
	@Autowired
	private UserServiceimpl impl;
    @RequestMapping(value="/findalluser")
    public String findalluser(Model model){
    	List<User> listuser=impl.findalluser();
    	model.addAttribute("alluser",listuser);
    	return "findalluser";
    }
    @RequestMapping(value="/deleteuser")
    public String deleteuser(int userid){
    	impl.deleteuser(userid);
    	return "redirect:/findalluser";
    }
    
    @RequestMapping(value="/insertuser")
    public String insertuser(User user){
    	impl.insertuser(user);
    	return "redirect:/findalluser";
    }
    
    @RequestMapping(value="/finduser")
    public @ResponseBody List<User> finduser(@RequestBody String username){
    	System.out.println(username);
       List<User> userlist=impl.finduser(username);
    
    	return userlist;
    }
}
