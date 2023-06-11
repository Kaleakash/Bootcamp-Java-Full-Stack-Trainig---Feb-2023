package com.main;

import java.util.Iterator;
import java.util.List;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
	EmployeeService es = new EmployeeService();
		// Insert Operation 
//	Employee emp = new Employee();
//	emp.setId(1);
//	emp.setName("Lokesh");
//	emp.setSalary(45000);
//	String result = es.storeEmployee(emp);
//	System.out.println(result);
	
	// Update Operation 
//	Employee emp = new Employee();
//	emp.setId(5);
//	emp.setSalary(50000);
//	String result = es.updateEmployee(emp);
//	System.out.println(result);
	
	// Delete Operation 
//	String result = es.deleteEmployee(1);
//	System.out.println(result);
	
	// find record 
//	String result = es.findEmployee(2);
//	System.out.println(result);
	
	// Find all Employee 
	//List<Employee> listOfEmp = es.findAllEmployee();
//	List<Employee> listOfEmp = es.findEmployeeBySalary(30000);
//	Iterator<Employee> li = listOfEmp.iterator();
//	while(li.hasNext()) {
//		Employee emp = li.next();
//		System.out.println(emp);
//	}
	
//	// retrieve all names 
//	List<String> listOfEmp = es.findEmployeeNames();
//	Iterator<String> li = listOfEmp.iterator();
//	while(li.hasNext()) {
//		String name = li.next();
//		System.out.println(name);
//	}
	
//	// retrieve all salary
//		List<Float> listOfEmp = es.findEmployeeSalary();
//		Iterator<Float> li = listOfEmp.iterator();
//		while(li.hasNext()) {
//			float salary = li.next();
//			System.out.println(salary);
//		}
	
//	// retrieve all name and salary
//			List<Object[]> listOfEmp = es.findEmployeeNamesAndSalary();
//			Iterator<Object[]> li = listOfEmp.iterator();
//			while(li.hasNext()) {
//				Object obj[]=li.next();
//				System.out.println("name is "+obj[0]+" salary is "+obj[1]);
//			}
	
	// retrieve using SQL query 
				List<Object[]> listOfEmp = es.findResultUsingSQL();
				Iterator<Object[]> li = listOfEmp.iterator();
				while(li.hasNext()) {
					Object obj[]=li.next();
					System.out.println("pid is "+obj[0]+" pname is "+obj[1]+" order is "+obj[2]+" emailid "+obj[3]);
					//System.out.println("id is "+obj[0]+" name is "+obj[1]+" salary is "+obj[2]);
				}
	}

}



