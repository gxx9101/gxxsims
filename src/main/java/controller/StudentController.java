package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import dao.Studentdaoimpl;
import domain.Student;
import domain.Testexcel;
import domain.Upload;

@Controller
public class StudentController {
	@RequestMapping(value = "/student")
	public String addstudent(Student student) {
		/*
		 * student.setStuid(student.getStuid());
		 * student.setStuname(student.getStuname());
		 * student.setGrade(student.getGrade());
		 * student.setStuphone(student.getStuphone());
		 * student.setMother(student.getMother());
		 * student.setFather(student.getFather());
		 */
		Studentdaoimpl impl = new Studentdaoimpl();
		impl.addstudent(student);
		return "redirect:/findallstudent";

	}

	@RequestMapping("/uploadimg")
	public String uploadimg(HttpServletRequest req, MultipartFile file) {
		String url = req.getSession().getServletContext().getRealPath("/upload");
		String url_s = "";
		try {
			File convFile = new File(file.getOriginalFilename());
			convFile.createNewFile();
			FileOutputStream fos = new FileOutputStream(convFile);
			fos.write(file.getBytes());
			fos.close();

			String filename = UUID.randomUUID().toString();
			String name = file.getOriginalFilename();
			System.out.println(name);
			String suffix = name.substring(name.lastIndexOf('.'));

			url_s = Upload.upload(convFile, url, filename + suffix);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String stuid = req.getParameter("stuid");
		Studentdaoimpl impl = new Studentdaoimpl();
		impl.addstudentimg(url_s, stuid);
		return "redirect:/findallstudent";

	}

	/*
	 * @RequestMapping("uploadimg") public String uploadimg(MultipartFile file)
	 * throws Exception{ String filename = file.getOriginalFilename();
	 * file.transferTo(new File("D:/temp/" + filename));
	 * 
	 * return "ok"; }
	 */

	@RequestMapping(value="/uploadexcel")
	public String uploadexcel(HttpSession session,@RequestParam MultipartFile file)throws IllegalStateException,IOException{
		if(!file.isEmpty()){
			String location=session.getServletContext().getRealPath("/upload");
			String url=location+"/"+System.currentTimeMillis()+file.getOriginalFilename();
			System.out.println(url);
			file.transferTo(new File(url));
			Testexcel.start(url);
		}
		
		return "redirect:/findallstudent";
	}
	
	@RequestMapping(value = "/findallstudent")
	public String findallstudent(HttpServletRequest req) {
		Studentdaoimpl impl = new Studentdaoimpl();
		req.getSession().setAttribute("student", impl.findallstudent());
		return "findallstudent";

	}

}
