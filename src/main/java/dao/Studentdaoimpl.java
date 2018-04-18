package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Student;


public class Studentdaoimpl implements Studentdao {
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs =null;
	public int addstudent(Student student) {
		String sql="insert into students(Stuid,Stuname,Grade,Stuphone,Mother,Father) values(?,?,?,?,?,?)";
		int i=0;
		try{
			conn=Conn.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,student.getStuid());
			pstmt.setString(2,student.getStuname());
			pstmt.setString(3,student.getGrade());
			pstmt.setString(4,student.getStuphone());
			pstmt.setString(5,student.getMother());
			pstmt.setString(6,student.getFather());
			i=pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			Conn.release(pstmt);
			Conn.release(conn);
		}
		return i;
	}

	public int addstudentimg(String image,String stuid) {
		String sql="update students set Image=? where Stuid=?";
		int i=0;
		try{
			conn=Conn.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,image);
			pstmt.setString(2,stuid);
			i=pstmt.executeUpdate();
			 System.out.println(image);
	         System.out.println(stuid);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			Conn.release(pstmt);
			Conn.release(conn);
		}
		return i;
	}
	
	public List<Student> findallstudent() {
		List<Student> groups=new ArrayList<Student>();
		String sql="select * from students";
		try{
			conn=Conn.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Student student=new Student();
				student.setStuid(rs.getString("Stuid"));
				student.setStuname(rs.getString("Stuname"));
				student.setGrade(rs.getString("Grade"));
				student.setStuphone(rs.getString("Stuphone"));
				student.setMother(rs.getString("Mother"));
				student.setFather(rs.getString("father"));
				student.setImage(rs.getString("Image"));
				groups.add(student);
			}
			}catch(SQLException e){
				e.printStackTrace();
				
			}finally{
				Conn.release(pstmt);
				Conn.release(conn);
				Conn.release(rs);
				
		}
		return groups;
	}

	public Student findstudent(int stuid) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
