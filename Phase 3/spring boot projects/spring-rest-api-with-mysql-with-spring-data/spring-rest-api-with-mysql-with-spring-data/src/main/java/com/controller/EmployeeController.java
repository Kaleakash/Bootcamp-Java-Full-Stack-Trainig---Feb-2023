package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> findAllEmployee() {
		return employeeService.findAllEmployee();
	}
	
	@GetMapping(value = "findEmployeeBySalary/{salary}")
	public List<Employee> findEmployeeBySalary(@PathVariable("salary") float salary){
		return employeeService.findEmployeeBySalary(salary);
	}
	
	@GetMapping(value = "findEmployee/{id}")
	public Employee findEmployee(@PathVariable("id") int id) {
		return employeeService.findEmployee(id);
	}
	@PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeEmployee(@RequestBody Employee emp) {
		return employeeService.storeEmployee(emp);
	}
	@DeleteMapping(value = "delete/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);
	}
	@PatchMapping(value = "update",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateEmloyee(@RequestBody Employee emp) {
		return employeeService.updateEmployee(emp);
	}
}


