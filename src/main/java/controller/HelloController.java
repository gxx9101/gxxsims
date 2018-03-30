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
	public String getTop() {
		return "top";
	}

	@RequestMapping(value = "/left")
	public String getLeft() {
		return "left";
	}

	@RequestMapping(value = "/hello")
	public String getHello() {
		return "hello";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}

}
