package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.bean.Student;
import com.bean.Trainer;
import com.resourcce.DbResouce;

public class TrainerDao {

	public int storeTrainer(Trainer trainer) {
		try {
		EntityManager manager = DbResouce.getEntityManagerFactory().createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
			manager.persist(trainer);
		tran.commit();
		return 1;
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Trainer> findAllTrainer() {
		EntityManager manager = DbResouce.getEntityManagerFactory().createEntityManager();
		Query qry = manager.createQuery("select t from Trainer t");
		List<Trainer> listOfTrainer = qry.getResultList();
		return listOfTrainer;
	}
}
