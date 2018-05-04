package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.PageBean;
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

	public Student findstudent(String stuid) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deletestudent(String stuid) {
		// TODO Auto-generated method stub
		int i =0;
		String sql="delete from students where Stuid=?";
		try{
			conn=Conn.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, stuid);
			i=pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
		   Conn.release(conn);
		   Conn.release(pstmt);
		}
		return i;
	}

	public PageBean<Student> findbypage(int pc){
		int ps=3;
		int all=0;
		/**
		 * 初始化当前页面几局输为ps 3 
		 * 要查询内容在数据库总数据数 all 为 3
		 * select count (*) from students;
		 * select * from student limit 1,3
		 * 分别获取all，
		 * 选取要分页显示的内容 显示3条记录，从第二条记录开始
		 */
		String sql="select count(*) from students";
		try{
			conn=Conn.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				all=Integer.parseInt(rs.getString("count(*)"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}
		/**
		 * 新建泛型类对象，数据类型为Student,并调用相关方法
		 */
		PageBean<Student> pageBean=new PageBean<Student>();
		pageBean.setAll(all);
		pageBean.setPc(pc);
		pageBean.setPs(ps);
		
		List<Student> list=new ArrayList<Student>();
		sql="select * from students limit "+(pc-1)*ps+","+ps;
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
					list.add(student);
				}
				
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
			
		}
			pageBean.setBeanlist(list);
			return pageBean;
	}
	
	
}
