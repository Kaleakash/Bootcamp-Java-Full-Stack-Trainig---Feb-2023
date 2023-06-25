package eshopping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
@Id
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

}
