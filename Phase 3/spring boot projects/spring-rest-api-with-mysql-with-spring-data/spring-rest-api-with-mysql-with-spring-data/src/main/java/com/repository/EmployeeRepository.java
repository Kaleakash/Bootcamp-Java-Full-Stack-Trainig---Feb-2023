package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	//@Query("select e from Employee e where e.salary > 12000")
	@Query("select e from Employee e where e.salary > :sal")
	public List<Employee> findBySalary(@Param("sal") float salary);
	
}
