package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> findAllEmployee() {
		return employeeDao.findAllEmployee();
	}
	
	public String findEmployeeById(int id) {
		Employee emp = employeeDao.findEmployee(id);
		if(emp==null) {
			return "Employee record not present with id as "+id;
		}else {
			return emp.toString();
		}
	}
	
	public List<Employee> findEmployeeBySalary(float salary){
		return employeeDao.findEmployeeBySalary(salary);
	}
	
	public String storeEmployee(Employee emp) {
			if(employeeDao.storeEmployee(emp)) {
				return "Employee record stored in database successfully";
			}else {
				return "Employee record din't store ";
			}
	}
	
	public String updateEmployeeSalary(Employee emp) {
		return employeeDao.updateEmployeeSalary(emp);
	}
	
	public String updateEmployeeDetails(Employee emp) {
		return employeeDao.updateEmployee(emp);
	}
	
	public String deleteEmployeeRecord(int id) {
		return employeeDao.deleteEmployeeRecord(id);
	}
}


