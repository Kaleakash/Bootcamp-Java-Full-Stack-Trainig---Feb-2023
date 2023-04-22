package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;
import com.resource.DbResource;

public class EmployeeDao {
	Connection con;
	
	public EmployeeDao() {
	con = DbResource.getDbConnection();
	}
	
	public int storeEmployee(Employee employee) {
		try {
	PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
	pstmt.setInt(1, employee.getId());
	pstmt.setString(2,employee.getName());
	pstmt.setFloat(3, employee.getSalary());
	return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int updateEmployee(Employee employee) {
		try {
	PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where id = ?");
	pstmt.setInt(2, employee.getId());
	pstmt.setFloat(1, employee.getSalary());
	return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public int deleteEmployee(Employee employee) {
		try {
	PreparedStatement pstmt = con.prepareStatement("delete from employee where id =?");
	pstmt.setInt(1, employee.getId());
	return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	
	public Employee findEmployeeById(int id) {
		try {
	PreparedStatement pstmt = con.prepareStatement("select * from employee where id = ?");
	pstmt.setInt(1, id);
	ResultSet rs = pstmt.executeQuery();
	if(rs.next()) {
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getFloat(3));
		return emp;
		}
		} catch (Exception e) {
			System.out.println(e);
		
		}
		return null;
	}
	
	public List<Employee> findEmployees() {
		List<Employee> listOfEmp = new ArrayList<>();
		try {
	PreparedStatement pstmt = con.prepareStatement("select * from employee");
	ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getFloat(3));
		listOfEmp.add(emp);
		}
	
		} catch (Exception e) {
			System.out.println(e);	
		}
		return listOfEmp;
	}
}
