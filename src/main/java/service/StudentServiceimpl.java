package service;

import dao.Studentdaoimpl;
import domain.PageBean;
import domain.Student;

public class StudentServiceimpl implements StudentService {

	public PageBean<Student> findbypage(int pc) {
		// TODO Auto-generated method stub
		Studentdaoimpl impl=new Studentdaoimpl();
		try{
			return impl.findbypage(pc);
		}
		catch(Exception e){
			throw new RuntimeException(e);
		}
	}

}
