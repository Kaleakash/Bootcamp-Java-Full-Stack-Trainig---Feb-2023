package com.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paytm {
@Id
private String emailid;
private int accno;
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}

}

