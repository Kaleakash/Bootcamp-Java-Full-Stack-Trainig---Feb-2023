package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bean.Employee;

public class EmployeeDao {

	EntityManagerFactory emf;
	public EmployeeDao() {
		emf = Persistence.createEntityManagerFactory("JPACrudOperation");
	}
	public int storeEmployee(Employee emp) {
		// load the persisten.xml file and get the database details using persistence unit name. 
		// This code is equal to Connection in JDBC.
		try {
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");
		
		// it is equal to Statement or PreparedStatement in JdBC. 
		EntityManager manager = emf.createEntityManager();
		
		EntityTransaction tran = manager.getTransaction();
		
		tran.begin();
			manager.persist(emp);     // insert query equal to executeUpdate method in JDBC. 
							// insert into emp values(1,'Lex',13000);
		tran.commit();
		return 1;
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int updateEmployee(Employee emp) {
		// load the persisten.xml file and get the database details using persistence unit name. 
		// This code is equal to Connection in JDBC.
		
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");
		
		// it is equal to Statement or PreparedStatement in JdBC. 
		EntityManager manager = emf.createEntityManager();
		
		EntityTransaction tran = manager.getTransaction();
		
		Employee e	= manager.find(Employee.class, emp.getId());  // select * from employee where id =1;
		
		if(e==null) {
			return 0;
		}else {
			e.setSalary(emp.getSalary());   // we change old salary by new salary. 
			tran.begin();
					manager.merge(e);   // update the record 
			tran.commit();
			return 1;
		}
	}
	
	public int deleteEmployee(int id) {
		// load the persisten.xml file and get the database details using persistence unit name. 
		// This code is equal to Connection in JDBC.
		
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");
		
		// it is equal to Statement or PreparedStatement in JdBC. 
		EntityManager manager = emf.createEntityManager();
		
		EntityTransaction tran = manager.getTransaction();
		
		Employee e	= manager.find(Employee.class, id);  // select * from employee where id =1;
		
		if(e==null) {
			return 0;
		}else {
	
			tran.begin();
					manager.remove(e);   // delete query 
			tran.commit();
			return 1;
		}
	}
	
	public Employee findEmployee(int id) {
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");
		EntityManager manager = emf.createEntityManager();
		Employee e	= manager.find(Employee.class, id);  // select * from employee where id =1;
		return e;
	}
	
	public List<Employee> findAllEmployee() {
		EntityManager manager = emf.createEntityManager();
		Query qry  = manager.createQuery("select e from Employee e");	// retreive objects. 
		List<Employee> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
	
	// full object 
	public List<Employee> findEmployeeBySalary(float salary) {
		EntityManager manager = emf.createEntityManager();
		//Query qry  = manager.createQuery("select e from Employee e where e.salary >14000");	// retreive objects. 
		Query qry  = manager.createQuery("select e from Employee e where e.salary > :sal");	// retreive objects.
		qry.setParameter("sal", salary);
		List<Employee> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
	// only one property 
	public List<String> findEmployeeNames() {
		EntityManager manager = emf.createEntityManager();
		//Query qry  = manager.createQuery("select e from Employee e where e.salary >14000");	// retreive objects. 
		Query qry  = manager.createQuery("select e.name from Employee e");	// retreive objects.
		List<String> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
	
	public List<Float> findEmployeeSalary() {
		EntityManager manager = emf.createEntityManager();
		//Query qry  = manager.createQuery("select e from Employee e where e.salary >14000");	// retreive objects. 
		Query qry  = manager.createQuery("select e.salary from Employee e");	// retreive objects.
		List<Float> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
	// more than one property 
	public List<Object[]> findEmployeeNameAndSalary() {
		EntityManager manager = emf.createEntityManager();
		//Query qry  = manager.createQuery("select e from Employee e where e.salary >14000");	// retreive objects. 
		Query qry  = manager.createQuery("select e.name, e.salary from Employee e");	// retreive objects.
		List<Object[]> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
	
	public List<Object[]> findRecordUsingSQL() {
		EntityManager manager = emf.createEntityManager();
		//JPQL : according to JPQL we requried entity class in java side. 
		//Query qry  = manager.createQuery("select p.pid,p.pname,o.oid,o.emailid from Product p, Orders o where p.pid = o.oid");	// retreive objects.
		// In native query we can use SQL query 
		//Query qry  = manager.createNativeQuery("select p.pid,p.pname,o.oid,o.emailid from Product p, Orders o where p.pid = o.oid");	
		Query qry  = manager.createNativeQuery("select * from employee");	
		List<Object[]> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
}
