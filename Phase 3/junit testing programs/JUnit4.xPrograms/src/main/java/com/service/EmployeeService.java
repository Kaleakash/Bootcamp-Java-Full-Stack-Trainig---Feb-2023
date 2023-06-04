package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;

public class EmployeeService {

	public Employee getEmployee() {
		Employee emp = new Employee(100, "Ravi", 12000);
		return emp;
	}
	
	public List<Employee> getEmployees() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.clear();
		listOfEmp.add(new Employee(1, "Lokesh", 14000));
		listOfEmp.add(new Employee(2, "Steven", 16000));
		listOfEmp.add(new Employee(3, "Ajay", 19000));
		return listOfEmp;
	}
	
	public Employee updateSalary(Employee emp) {
		// with condition we will update salary;
		emp.setSalary(emp.getSalary()+5000);
		return emp;
	}
	public boolean checkLogin(String emailid, String password) {
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			return true;
		}else {
			return false;
		}
	}
}
