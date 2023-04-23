package com.bean;

public class Login {			//  this class is use to map to table
private String emailid;
private String password;
public Login() {
	super();
	// TODO Auto-generated constructor stub
}
public Login(String emailid, String password) {
	super();
	this.emailid = emailid;
	this.password = password;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Login [emailid=" + emailid + ", password=" + password + "]";
}

}
