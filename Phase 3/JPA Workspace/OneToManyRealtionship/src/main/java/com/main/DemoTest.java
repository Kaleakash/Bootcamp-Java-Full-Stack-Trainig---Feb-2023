package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Student;
import com.bean.Trainer;
import com.service.StudentService;
import com.service.TrainerService;

public class DemoTest {

	public static void main(String[] args) {
		TrainerService ts = new TrainerService();
		StudentService ss = new StudentService();
	// Store Trainer details 
//		Trainer t = new Trainer();
//		t.setTid(2);
//		t.setTname("Ravi");
//		t.setTech("Python");
//		String result = ts.storeTrainer(t);
//		System.out.println(result);

		// Store student details 
//		Student s1 = new Student();
//		s1.setSid(103);
//		s1.setSname("Meeta");
//		s1.setAge(24);
//		//s1.setTsid(3);
//		String result = ss.storeStudent(s1);
//		System.out.println(result);
		
//		// View all students;
//		
//		List<Student> listOfStd = ss.findAllStudents();
//		Iterator<Student> ii = listOfStd.iterator();
//		while(ii.hasNext()) {
//			Student s = ii.next();
//			System.out.println(s);
//		}
		
		// View all Trainer;
		
//				List<Trainer> listOfTrainer = ts.findAllTrainer();
//				Iterator<Trainer> ii = listOfTrainer.iterator();
//				while(ii.hasNext()) {
//					Trainer t = ii.next();
//					System.out.println(t);
//				}
		
//		// retrieve trainer and student details using join concept. 
//		List<Object[]> list = ss.findTainerAndStudentInfo();
//		Iterator<Object[]> li = list.iterator();
//		while(li.hasNext()) {
//			Object obj[]=li.next();
//			System.out.println("Trainer name is "+obj[0]+" Student Name is "+obj[1]+" Tech "+obj[2]);
//		}
		// Display Trainer name and student naem 
		
//		List<Trainer> listOfTrainer = ts.findAllTrainer();
//		Iterator<Trainer> ii = listOfTrainer.iterator();
//		while(ii.hasNext()) {
//			Trainer t = ii.next();
//		System.out.println(" Trainer is "+t.getTname()+" Tech "+t.getTech());
//				List<Student> listOfStd = t.getListOfStd();
//				Iterator<Student> ii1 = listOfStd.iterator();
//				while(ii1.hasNext()) {
//					Student s = ii1.next();
//					System.out.println("Student name is "+s.getSname());
//				}
//		}
		
		// Store Trainer details with Student details also 
		Trainer t = new Trainer();
			t.setTid(3);
			t.setTname("Akash");
			t.setTech("Spring framework");
		
		Student s1= new Student();
		s1.setSid(104);
		s1.setSname("Johson");
		s1.setAge(32);
		s1.setTsid(3);
		
		Student s2= new Student();
		s2.setSid(105);
		s2.setSname("Baron");
		s2.setAge(32);
		s2.setTsid(3);
		
		List<Student> listOfStd = new ArrayList();
		listOfStd.add(s1);
		listOfStd.add(s2);
			
			t.setListOfStd(listOfStd);
		
		String result = ts.storeTrainer(t);
		System.out.println(result);
	}

}
