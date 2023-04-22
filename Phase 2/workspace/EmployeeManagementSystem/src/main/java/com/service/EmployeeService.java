package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {

	EmployeeDao ed = new EmployeeDao();
	
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()<12000) {
			return "Employee salary must be > 12000";
		}else if(ed.storeEmployee(emp)>0) {
			return "Employee data in database successfully";
		}else {
			return "Record didn't store";
		}
	}
	
	public String updateEmployee(Employee emp) {
		if(ed.updateEmployee(emp)>0) {
			return "Employee record updated successfully";
		}else {
			return "Employee record didn't update";
		}
	}
	
	public String deleteEmployee(Employee emp) {
		if(ed.deleteEmployee(emp)>0) {
			return "Employee record deleted successfully";
		}else {
			return "Employee record not present";
		}
	}
	
	public String findEmployee(int empid) {
		Employee emp = ed.findEmployeeById(empid);
		if(emp==null) {
			return "Record not present";
		}else {
			return emp.toString();
		}
	}
	
	public List<Employee> findAllEmployee() {
	List<Employee> listOfEmp = ed.findEmployees();
	Iterator<Employee> li = listOfEmp.iterator();
	while(li.hasNext()) {
		Employee emp  = li.next();
				emp.setSalary(emp.getSalary()+200);
	}
	return listOfEmp;
	}
	
	
}
