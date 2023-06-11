package com.service;

import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {
	EmployeeDao ed = new EmployeeDao();
	
	public String storeEmployee(Employee emp) {
		if(ed.storeEmployee(emp)>0) {
			return "Record inserted ";
		}else {
			return "Record didn't insert";
		}
	}
	
	public String updateEmployee(Employee emp) {
		if(ed.updateEmployee(emp)>0) {
			return "Record updated ";
		}else {
			return "Record didn't update";
		}
	}
	
	public String deleteEmployee(int id) {
		if(ed.deleteEmployee(id)>0) {
			return "Record deleted ";
		}else {
			return "Record didn't delete";
		}
	}
	
	public String findEmployee(int id) {
		Employee emp = ed.findEmployee(id);
		if(emp==null) {
			return "record not present";
		}else {
			return emp.toString();
		}
	}
	
	public List<Employee> findAllEmployee() {
		return ed.findAllEmployee();
	}
	public List<Employee> findEmployeeBySalary(float salary){
		return ed.findEmployeeBySalary(salary);
	}
	
	public List<String> findEmployeeNames(){
		return ed.findEmployeeNames();
	}
	
	public List<Float> findEmployeeSalary(){
		return ed.findEmployeeSalary();
	}
	
	public List<Object[]> findEmployeeNamesAndSalary(){
		return ed.findEmployeeNameAndSalary();
	}
	
	public List<Object[]> findResultUsingSQL() {
		return ed.findRecordUsingSQL();
	}
}
