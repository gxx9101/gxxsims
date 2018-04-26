package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import service.TestServiceimpl;

@Controller
public class TestController {
@Autowired
   private TestServiceimpl serviceimpl;
@RequestMapping(value="/test")
   public String test(Model model){
	serviceimpl.findalltest();
	model.addAttribute("tests",serviceimpl.findalltest());
	return "test";
}
}
