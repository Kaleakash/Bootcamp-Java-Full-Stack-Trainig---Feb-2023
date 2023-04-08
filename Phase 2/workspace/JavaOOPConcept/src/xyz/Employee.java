package xyz;

public class Employee {
private int id;
private String name;
private float salary;

// default construtor with empty body 
public Employee(int id, String name, float salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

}
