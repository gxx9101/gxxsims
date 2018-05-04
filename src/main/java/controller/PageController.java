package controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.PageBean;
import domain.Student;
import service.StudentServiceimpl;
@Controller
public class PageController {
   private StudentServiceimpl impl=new StudentServiceimpl();
   private int getPc(HttpServletRequest request){
	   int pc=1;
	   String parm=request.getParameter("pc");
	   if(parm !=null && !parm.trim().isEmpty()){
		   pc=Integer.parseInt(parm);
	   }
	   return pc;
   }
   
   private String getUrl(HttpServletRequest request){
	   String url=request.getRequestURI()+"?"+request.getQueryString();
	   int index=url.lastIndexOf("?");
	   if(index != -1){
		   url=url.substring(0,index);
	   }
	   return url;
			   
   }
   @RequestMapping(value="/findallstudent")
   public String findallstudent(HttpServletRequest request,Model model){
	   int pc=getPc(request);
	   String url=getUrl(request);
	   PageBean<Student> pageBean=impl.findbypage(pc);
	   pageBean.setUrl(url);
	   model.addAttribute("pb",pageBean);
	   return "findallstudent";
   }
}
