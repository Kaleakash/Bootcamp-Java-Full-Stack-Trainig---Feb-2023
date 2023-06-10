package com;

import java.nio.file.spi.FileSystemProvider;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		//Employee emp1 = new Employee();
		// Employee emp2 = new Employee();
		//emp.display();
	//BeanFactory is a interface 
		
	//BeanFactory obj = new XmlBeanFactory(new ClassPathResource("beans.xml"));	
		Resource res = new ClassPathResource("beans.xml");
		BeanFactory obj = new XmlBeanFactory(res);
		
//		Employee emp1 = (Employee)obj.getBean("emp1");  // pull the object from container 
//		emp1.display();
//		
//		Employee emp2 = (Employee)obj.getBean("emp1");  // pull the object from container 
//		emp2.display();
//		
//		Employee emp3 = (Employee)obj.getBean("emp2");  // pull the object from container 
//		emp3.display();
//		
//		Employee emp4 = (Employee)obj.getBean("emp2");  // pull the object from container 
//		emp4.display();
		
//		Employee emp1 = (Employee)obj.getBean("emp1");
//		System.out.println(emp1);     // toString method called.
//		
//		Employee emp2 = (Employee)obj.getBean("emp1");
//		System.out.println(emp2);     // toString method called.
//		
//		Employee emp3 = (Employee)obj.getBean("emp3");
//		System.out.println(emp3);     // toString method called.
//		
//		Employee emp4 = (Employee)obj.getBean("emp4");
//		System.out.println(emp4);     // toString method called.
//		
//		Employee emp5 = (Employee)obj.getBean("emp5");
//		System.out.println(emp5);     // toString method called.
//		
//		emp5.setSalary(45000);
//		System.out.println(emp5);
		
		Employee emp = (Employee)obj.getBean("employee");
		System.out.println(emp);
	}

}
