package dao;

import java.util.List;

import domain.PageBean;
import domain.Student;

public interface Studentdao {
      public int addstudent(Student student);
      public int addstudentimg(String image,String stuid);
      public List<Student> findallstudent();
      public Student findstudent(String stuid);
      public int deletestudent(String stuid);

      /**
       * 写一个接口，方法是通过页码查询内容
       */
      public PageBean<Student> findbypage(int pc);
}
