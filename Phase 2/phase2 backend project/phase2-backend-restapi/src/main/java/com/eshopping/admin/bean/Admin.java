package com.eshopping.admin.bean;

public class Admin {
private String emailid;
private String password;
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
	return "Admin [emailid=" + emailid + ", password=" + password + "]";
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
public Admin(String emailid, String password) {
	super();
	this.emailid = emailid;
	this.password = password;
}

}
