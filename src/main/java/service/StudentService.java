package service;

import domain.PageBean;
import domain.Student;

public interface StudentService {
   public PageBean<Student> findbypage(int pc);
}
