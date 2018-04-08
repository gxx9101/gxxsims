package controller;

import javax.servlet.http.HttpServletRequest;

//import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.SessionAttributes;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
   
   
}
