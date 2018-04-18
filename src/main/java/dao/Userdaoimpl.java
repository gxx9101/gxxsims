package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

	
	
	
	
}
