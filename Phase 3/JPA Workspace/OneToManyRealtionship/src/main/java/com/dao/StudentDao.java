package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.bean.Student;
import com.resourcce.DbResouce;

public class StudentDao {

	public int storeStudent(Student student) {
		try {
		EntityManager manager = DbResouce.getEntityManagerFactory().createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
			manager.persist(student);
		tran.commit();
		return 1;
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Student> findAllStudent() {
		EntityManager manager = DbResouce.getEntityManagerFactory().createEntityManager();
		Query qry = manager.createQuery("select s from Student s");
		List<Student> listOfStd = qry.getResultList();
		return listOfStd;
	}
	
	public List<Object[]> findTrainerAndStudent() {
		EntityManager manager = DbResouce.getEntityManagerFactory().createEntityManager();
		// this is join with JPQL 
		Query qry = manager.createQuery("select t.tname, s.sname, t.tech from Trainer t, Student s where t.tid = s.tsid");
		List<Object[]> details = qry.getResultList();
		return details;
	}
}
