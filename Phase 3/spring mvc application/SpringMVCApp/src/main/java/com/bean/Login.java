package com.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Login {
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
public Login() {
	super();
	// TODO Auto-generated constructor stub
}
public Login(String emailid, String password) {
	super();
	this.emailid = emailid;
	this.password = password;
}
@Override
public String toString() {
	return "Login [emailid=" + emailid + ", password=" + password + "]";
}

}
