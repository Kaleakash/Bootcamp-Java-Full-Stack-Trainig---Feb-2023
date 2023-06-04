package com.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.bean.Employee;

public class EmployeeServiceTest {

	static EmployeeService es;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		es = new EmployeeService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		es = null;		// GC
	}

	@Test
	//@Ignore
	public void testGetEmployee() {
		Employee emp  = es.getEmployee();
		assertNotNull(emp);
		assertEquals(100, emp.getId());
		assertEquals("Ravi", emp.getName());
		assertEquals(12000, emp.getSalary(),0.0); 
		//assertEq
	}

	@Test
	public void testGetEmployees() {
		//fail("Not yet implemented");
		List<Employee> listOfEmp= es.getEmployees();
		assertEquals(3, listOfEmp.size());
		Employee emp = listOfEmp.get(2);
		assertEquals(3, emp.getId());
		assertEquals("Ajay", emp.getName());
		assertEquals(19000, emp.getSalary(),0.0); 
	}

	@Test
	@Ignore
	public void testUpdateSalary() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testCheckLogin() {
		fail("Not yet implemented");
	}

}
