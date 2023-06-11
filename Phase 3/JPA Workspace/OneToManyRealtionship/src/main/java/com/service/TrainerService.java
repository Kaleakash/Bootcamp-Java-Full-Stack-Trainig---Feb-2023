package com.service;

import java.util.List;

import com.bean.Trainer;
import com.dao.TrainerDao;

public class TrainerService {

	TrainerDao td  = new TrainerDao();
	
	public String storeTrainer(Trainer trainer) {
		if(td.storeTrainer(trainer)>0) {
			return "Trainer record saved";
		}else {
			return "Trainer record didn't store";
		}
		
	}
	
	public List<Trainer> findAllTrainer() {
		return td.findAllTrainer();
	}
	
	
}
