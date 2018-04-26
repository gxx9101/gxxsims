package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

//import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.SessionAttributes;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.Userdaoimpl;
import domain.User;

@Controller

public class LoginController {
   @RequestMapping(value="/namepass")
   public String islogin(HttpServletRequest req){
	   String username=req.getParameter("username");	  
	   String password=req.getParameter("password");	  
	   Userdaoimpl impl=new Userdaoimpl();
	   User user=impl.isuser(username, password);	 
	   req.getSession().setAttribute("user", user); 
	   return "index";
   }
   @RequestMapping(value="/zhuce")
   public @ResponseBody User adduser(@RequestBody User u){
	   System.out.println("id"+u.getUsername()+"aaa");
	   System.out.println("id"+u.getPassword()+"bbb");
	   System.out.println("id"+u.getPhone()+"ccc");
	   Userdaoimpl impl=new Userdaoimpl();
	   impl.adduser(u);
	   return u;
	   
   }

   }
   

