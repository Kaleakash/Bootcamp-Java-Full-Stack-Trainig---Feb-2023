package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
public class EmployeeController {

	// http://localhost:8080/employee
	@RequestMapping(value = "employee",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeDetails() {
		Employee emp = new Employee(100, "Steven", 14000);
		return emp;
	}
	
	// http://localhost:8080/employees
	@RequestMapping(value = "employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeeDetails() {
		Employee emp1 = new Employee(100, "Steven", 14000);
		Employee emp2 = new Employee(101, "Lex", 18000);
		Employee emp3 = new Employee(102, "Neena", 24000);
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		return listOfEmp;
	}
	
	// http://localhost:8080/singleQueryParam?name=Ravi
	@RequestMapping(value = "singleQueryParam")
	public String singleQueryParam(@RequestParam("name") String fname) {
		return "Welcome to Spring boot with query param technique "+fname;
	}
	
	// http://localhost:8080/singlePathParam/Ravi
		@RequestMapping(value = "singlePathParam/{name}")
		public String singlePathParam(@PathVariable("name") String fname) {
			return "Welcome to Spring boot with path param technique "+fname;
		}
		
		// http://localhost:8080/multiQueryParam?name=Ravi&salary=12000
		@RequestMapping(value = "multiQueryParam")
		public String multiQueryParam(@RequestParam("name") String fname, @RequestParam("salary") float salary) {
			return "Welcome to Spring boot with query param technique "+fname+" Salary is "+salary;
		}
		
		// http://localhost:8080/multiPathParam/Ravi/12000
		@RequestMapping(value = "multiPathParam/{name}/{salary}")
		public String multiPathParam(@PathVariable("name") String fname, @PathVariable("salary") float salary) {
			return "Welcome to Spring boot with Path param technique "+fname+" Salary is "+salary;
		}
		
		// http://localhost:8080/testPost 
		
		@RequestMapping(value = "testPost",method = RequestMethod.POST)
		public String postTestMethod() {
			return "Post method test";
		}
		// http://localhost:8080/storeEmployee  data {"id":100,name:"Raju","salary":14000}
		@RequestMapping(value = "storeEmployee",consumes = MediaType.APPLICATION_JSON_VALUE,
				method = RequestMethod.POST)
		public String storeEmployee(@RequestBody Employee emp) {
				System.out.println(emp);		// it will call toString method 
				return "Employee record stored with name as "+emp.getName();
		}
		
		// http://localhost:8080/updateEmployee  data {"id":100,"salary":14000}
				@RequestMapping(value = "updateEmployee",
						consumes = MediaType.APPLICATION_JSON_VALUE,
						produces = MediaType.APPLICATION_JSON_VALUE,
						method = RequestMethod.PUT)
				public Employee updateEmployee(@RequestBody Employee emp) {
						System.out.println(emp);		// it will call toString method 
						emp.setSalary(emp.getSalary()+500);
						return emp;
				}
		
				
				// http://localhost:8080/deleteEmployee/100
				@RequestMapping(value = "deleteEmployee/{id}",
						method = RequestMethod.DELETE)
				public String deleteEmployeeRecord(@PathVariable("id") int id) {
					return "Employee record deleted successfully "+id;
				}
}
