package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

	//EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
	
	@Autowired
	EntityManagerFactory emf;
	
	public List<Employee> findAllEmployee() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select e from Employee e"); //JPQL
		List<Employee> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
	
	public Employee findEmployee(int id) {
		EntityManager manager = emf.createEntityManager();
		Employee emp = manager.find(Employee.class, id);
		return emp;
	}
	
	public List<Employee> findEmployeeBySalary(float salary) {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select e from Employee e where e.salary > :sal"); //JPQL
		qry.setParameter("sal", salary);
		List<Employee> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
	
	public boolean storeEmployee(Employee emp) {
		try {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
			manager.persist(emp);
		tran.commit();
		return true;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public String updateEmployeeSalary(Employee emp) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Employee employee = manager.find(Employee.class, emp.getId());
		if(employee==null) {
			return "Record not present with id as "+emp.getId();
		}else {
			employee.setSalary(emp.getSalary());
			tran.begin();
					manager.merge(employee);
			tran.commit();
			return "Employee salary successfully";
		}
	}
	public String updateEmployee(Employee emp) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Employee employee = manager.find(Employee.class, emp.getId());
		if(employee==null) {
			return "Record not present with id as "+emp.getId();
		}else {
			employee.setSalary(emp.getSalary());
			employee.setName(emp.getName());
			tran.begin();
					manager.merge(employee);
			tran.commit();
			return "Employee record updated successfully";
		}
	}
	
	public String deleteEmployeeRecord(int id) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Employee employee = manager.find(Employee.class, id);
		if(employee==null) {
			return "Record not present with id as "+id;
		}else {
				tran.begin();
					manager.remove(employee);
			tran.commit();
			return "Employee record deleted successfully";
		}
	}
	
}
