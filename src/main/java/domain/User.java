package domain;

public class User {
   private int userid;	
   private String username;
   private String password;
   private String phone;
public User(int userid,String username, String password, String phone) {
	super();
	this.userid=userid;
	this.username = username;
	this.password = password;
	this.phone = phone;
}
   public User(){
	   super();
   }
   
   public int getUserid(){
	   return userid;
   }
   public void setUserid(int userid){
	   this.userid=userid;
   }
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
   
}
