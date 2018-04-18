package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/top")
	public String top() {
		return "top";
	}

	@RequestMapping(value = "/left")
	public String left() {
		return "left";
	}

	@RequestMapping(value = "/hello")
	public String hello() {		
		return "hello";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/addstudent")
	public String addstudent() {
		return "addstudent";
	}
	@RequestMapping(value = "/register")
	public String register() {
		return "register";
	}

}

