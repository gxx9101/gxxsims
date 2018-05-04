package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.TestServiceimpl;

@Controller
public class TestController {
@Autowired
   private TestServiceimpl serviceimpl;
//ʹ��Model�෵��ֵ
//@RequestMapping(value="/test")
//   public String test(Model model){
//	serviceimpl.findalltest();
//	model.addAttribute("tests",serviceimpl.findalltest());
//	return "test";
//}
//ʹ��ModelAndView�෵��ֵ
 @RequestMapping(value="/test")
 public ModelAndView test(){
	 ModelAndView vm=new ModelAndView();
	 vm.setViewName("test");
	 vm.addObject("tests",serviceimpl.findalltest());
	 return vm;
 }

}
