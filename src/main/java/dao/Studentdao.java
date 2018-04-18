package dao;

import java.util.List;

import domain.Student;

public interface Studentdao {
      public int addstudent(Student student);
      public int addstudentimg(String image,String stuid);
      public List<Student> findallstudent();
      public Student findstudent(int stuid);
}
