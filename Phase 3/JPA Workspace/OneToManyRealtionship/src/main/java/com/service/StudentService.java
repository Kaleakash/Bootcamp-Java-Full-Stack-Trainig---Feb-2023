package com.service;

import java.util.List;

import com.bean.Student;
import com.bean.Trainer;
import com.dao.StudentDao;
import com.dao.TrainerDao;

public class StudentService {

StudentDao sd = new StudentDao();
	
	public String storeStudent(Student student) {
		if(sd.storeStudent(student)>0) {
			return "Student record saved";
		}else {
			return "Student record didn't store";
		}
		
	}
	
	public List<Student> findAllStudents() {
		return sd.findAllStudent();
	}
	
	public List<Object[]> findTainerAndStudentInfo() {
		return sd.findTrainerAndStudent();
	}
}
