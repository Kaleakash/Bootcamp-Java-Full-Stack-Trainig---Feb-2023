package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Trainer {
@Id
private int tid;
private String tname;
private String tech;
@OneToMany(cascade = CascadeType.PERSIST)	// through trainer object we can do what operation on student object. 
@JoinColumn(name = "tsid")  // link to FK in student table. 
private List<Student> listOfStd;
//@OneToOne
//private Student std;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public List<Student> getListOfStd() {
	return listOfStd;
}
public void setListOfStd(List<Student> listOfStd) {
	this.listOfStd = listOfStd;
}
@Override
public String toString() {
	return "Trainer [tid=" + tid + ", tname=" + tname + ", tech=" + tech + ", listOfStd=" + listOfStd + "]";
}

}
