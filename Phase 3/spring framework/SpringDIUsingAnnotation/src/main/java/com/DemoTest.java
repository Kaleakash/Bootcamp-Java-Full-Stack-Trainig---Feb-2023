package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		//Resource res = new ClassPathResource("beans.xml");
		//BeanFactory obj = new XmlBeanFactory(res);
		
		//ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");		// partial xml file 

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);  // pure annotation base 
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
		emp.setId(101);
		emp.setName("Lokesh");
		emp.setSalary(45000);
		emp.getAdd().setCity("Mumbai");
		emp.getAdd().setState("Mh");
		System.out.println(emp);
	}

}
