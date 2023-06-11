package com.resourcce;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbResouce {

	static EntityManagerFactory emf;
	//this block call only once 
	static {
		emf = Persistence.createEntityManagerFactory("OneToManyRealtionship");
	}
	public static EntityManagerFactory getEntityManagerFactory() {
		//emf = Persistence.createEntityManagerFactory("OneToManyRealtionship");
		return emf;
	}
}
