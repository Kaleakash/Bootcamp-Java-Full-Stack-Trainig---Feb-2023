package eshopping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
@Id
private int accno;
private float amount;
private String emailid;
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}

}
