package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeSevice;
	
	// http://localhost:9090/findEmployees
	
	@RequestMapping(value = "findEmployees",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> findAllEmployee() {
		return employeeSevice.findAllEmployee();
	}
	
	// http://localhost:9090/findEmployeeById/1
	// http://localhost:9090/findEmployeeById/100
	
	@RequestMapping(value = "findEmployeeById/{id}")
	public String findEmployee(@PathVariable("id") int id) {
		return employeeSevice.findEmployeeById(id);
	}
	
	// http://localhost:9090/findEmployeeBySalary/50000
		// http://localhost:9090/findEmployeeBySalary/10000
		
	@RequestMapping(value = "findEmployeeBySalary/{salary}",produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Employee> findEmployeeBySalary(@PathVariable("salary") float salary) {
			return employeeSevice.findEmployeeBySalary(salary);
		}
	
	
	// http://localhost:9090/storeEmployee 		data : {"id":100,"name":"Steven","salary":140000}
	@RequestMapping(value = "storeEmployee",consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public String storeEmployee(@RequestBody Employee emp) {
		return employeeSevice.storeEmployee(emp);
	}
	
	// http://localhost:9090/updateEmployeeSalary 		data : {"id":100,"salary":190000}
		@RequestMapping(value = "updateEmployeeSalary",consumes = MediaType.APPLICATION_JSON_VALUE,
				method = RequestMethod.PATCH)
		public String updateEmployeeSalary(@RequestBody Employee emp) {
			return employeeSevice.updateEmployeeSalary(emp);
		}
		
		// http://localhost:9090/updateEmployeeDetails 	data : {"id":100,"name":"Steven","salary":140000}
		@RequestMapping(value = "updateEmployeeDetails",consumes = MediaType.APPLICATION_JSON_VALUE,
				method = RequestMethod.PUT)
		public String updateEmployeeDetails(@RequestBody Employee emp) {
			return employeeSevice.updateEmployeeDetails(emp);
		}
		
		// http://localhost:9090/deleteEmployeeRecordById/100
		
		@RequestMapping(value = "deleteEmployeeRecordById/{id}",method = RequestMethod.DELETE)
		public String deleteEmployeeRecord(@PathVariable("id") int id) {
			return employeeSevice.deleteEmployeeRecord(id);
		}
		
}
