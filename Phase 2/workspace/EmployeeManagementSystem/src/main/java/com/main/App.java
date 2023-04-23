package com.main;

import java.util.List;

import com.bean.Employee;
import com.service.EmployeeService;

public class App {

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		// Store employee
//		Employee emp1 = new Employee(101, "Vijay", 16000);
//		String result = es.storeEmployee(emp1);
//		System.out.println(result);

		// update employee 
//		Employee emp2 = new Employee();
//		emp2.setId(101);
//		emp2.setSalary(16000);
//		String result = es.updateEmployee(emp2);
//		System.out.println(result);
		
		// delete employee 
		
//		Employee emp2 = new Employee();
//		emp2.setId(100);
//		String result = es.deleteEmployee(emp2);
//		System.out.println(result);
		
		// search employee by id
		String result = es.findEmployee(1010);
		System.out.println(result);
		
//		List<Employee> listOfEmp = es.findAllEmployee();
//		for(Employee emp:listOfEmp) {
//			System.out.println(emp);
//		}
		
		
		
	}

}
