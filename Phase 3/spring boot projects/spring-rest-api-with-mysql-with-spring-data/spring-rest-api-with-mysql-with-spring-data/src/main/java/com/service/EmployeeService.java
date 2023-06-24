package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> findAllEmployee() {
		return employeeRepository.findAll();  // select * from employee sql 
	}										// select e from Employee e  JPQL 
	
	
	public String storeEmployee(Employee emp) {
		Optional<Employee> result = employeeRepository.findById(emp.getId());
		if(result.isPresent()) {
			return "Record didn't store becuause id must be unique";
		}else {
			employeeRepository.save(emp);
			return "Record stored";
		}
	}
	public String deleteEmployee(int id) {
		Optional<Employee> result = employeeRepository.findById(id);
		if(result.isPresent()) {
			employeeRepository.deleteById(id);
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
	
	public String updateEmployee(Employee emp) {
		Optional<Employee> result = employeeRepository.findById(emp.getId());
		if(result.isPresent()) {
			Employee e = result.get();
			e.setSalary(emp.getSalary());
			employeeRepository.saveAndFlush(e);
			return "Record updated successfully";
		}else {
			return "Record not present";
		}
	}
}



