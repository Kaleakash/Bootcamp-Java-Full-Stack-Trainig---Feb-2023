package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

// http://localhost:9090/employee/*
@RestController
@RequestMapping("employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	// http://localhost:9090/employees/findEmployees
	@GetMapping(value = "findEmployees",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> findAllEmployee() {
		return employeeService.findAllEmployee();
	}
}
