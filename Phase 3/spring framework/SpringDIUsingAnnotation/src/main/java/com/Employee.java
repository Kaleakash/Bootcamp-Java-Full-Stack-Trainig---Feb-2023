package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 					// <bean class="com.Employee"></bean>
@Scope("prototype")
public class Employee {		// by default id is class name using camel naming 
@Value(value = "100")
private int id;				// if class contains one word then lower case if class
@Value(value = "Ramesh")
private String name;		// more than one word then 2nd word onward first letter upper case
@Value(value = "34000")
private float salary;		// Employee then id is employee 
@Autowired
private Address add;		// EmployeeDetails then id employeeDetails  

	public Employee() {
		System.out.println("object created...");
	}
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
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

	public void display() {
		System.out.println("Employee class display method");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}
	
}
