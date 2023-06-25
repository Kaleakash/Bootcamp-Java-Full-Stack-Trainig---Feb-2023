package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
@Id
private int accno;
private String name;
private float amount;
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}

}
