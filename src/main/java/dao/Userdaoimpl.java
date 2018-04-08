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
		// TODO Auto-generated method stub
		return 0;
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
