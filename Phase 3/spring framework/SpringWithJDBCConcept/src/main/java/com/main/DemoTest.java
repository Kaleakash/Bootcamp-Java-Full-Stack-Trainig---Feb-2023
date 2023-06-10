package com.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Product;
import com.config.MyConfiguration;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
Product p = (Product)ac.getBean("product");
p.setPid(107);
p.setPname("Monitor");
p.setPrice(5500);

ProductService ps = (ProductService)ac.getBean("productService");//camel naming rules 
String result = ps.storeProduct(p);
//System.out.println(result);
//ProductService ps = (ProductService)ac.getBean("productService");//camel naming rules 
//List<Product> listOfProduct = ps.findAllProducts();
//Iterator<Product> ii = listOfProduct.iterator();
//while(ii.hasNext()) {
//	Product p = ii.next();
//	System.out.println(p);
//}

	}

}
