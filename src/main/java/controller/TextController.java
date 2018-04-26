package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.Userdaoimpl;
import domain.User;

@Controller
public class TextController {

	@RequestMapping(value="/starttext")
	public @ResponseBody List<User> text(){
		Userdaoimpl impl=new Userdaoimpl();
		List<User> userlist=impl.findalluser();
		return userlist;
	}
}
