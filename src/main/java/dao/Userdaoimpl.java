package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import domain.Mybatisuser;
import domain.User;

public class Userdaoimpl implements Userdao {
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs =null;
	

	public int adduser(User user) {
		String sql="insert into user(Username,Password,Phone) values(?,?,?)";
		int i=0;
		try{
			conn=Conn.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,user.getUsername());
			pstmt.setString(2,user.getPassword());
			pstmt.setString(3,user.getPhone());
			i=pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			Conn.release(pstmt);
			Conn.release(conn);
		}
		return i;
	}

	public User isuser(String username, String password) {
		String sql="select * from user where Username=? and Password=?";
		User user=new User();
		try{
			conn=Conn.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,username);
			pstmt.setString(2,password);
			rs=pstmt.executeQuery();
			if(rs.next()){
				user.setUsername(rs.getString("Username"));
				user.setPassword(rs.getString("Password"));
				user.setPhone(rs.getString("Phone"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			Conn.release(pstmt);
			Conn.release(conn);
			Conn.release(rs);
		}
		return user;
	}

	public List<User> findalluser() {
		String sql="select * from user";
		List<User> userlist=new ArrayList<User>();
		try{
			conn=Conn.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				User user=new User();
				user.setUsername(rs.getString("Username"));
				user.setPassword(rs.getString("Password"));
				user.setPhone(rs.getString("Phone"));
				userlist.add(user);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			Conn.release(pstmt);
			Conn.release(conn);
			Conn.release(rs);
		}
		return userlist;
	}
	
	 //mybatis�������ݿ�
	
	  SqlSessionFactory sqlSessionFactory=Mybatisuser.getSession();
	  SqlSession session=sqlSessionFactory.openSession();
	  
	public List<User> getAll(){	
		List<User> userlist=session.selectList("selectalluser");
		session.commit();
		session.close();
		return userlist;
	}

	public void deleteuser(int userid){
		session.delete("deleteuser",userid);
		session.commit();
		session.close();
	}

	public void insertuser(User user) {
		session.insert("insertuser",user);
		session.commit();
		session.close();
	}
	
	public List<User> finduser(String username){
		List<User> userlist=session.selectList("finduser", username);
		session.commit();
		session.close();
		return userlist;
	}
	
	
	
}
