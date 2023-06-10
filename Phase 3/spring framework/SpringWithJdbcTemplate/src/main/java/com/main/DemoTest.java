package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Product;

import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
ProductService ps = (ProductService)ac.getBean("productService");//camel naming rules 

//insert REcord 
//Product p = (Product)ac.getBean("product");
//p.setPid(106);
//p.setPname("Monitor");
//p.setPrice(17000);
//
//
//String result = ps.storeProduct(p);
//System.out.println(result);

// updat product 
//Product p = (Product)ac.getBean("product");
//p.setPid(1);
//p.setPrice(50000);
//String result = ps.updateProduct(p);
//System.out.println(result);

//delete product 
//Product p = (Product)ac.getBean("product");
//String result = ps.deleteProduct(0);
//System.out.println(result);

// Display records using List with Map features 

//List<Map<String, Object>> listOfRec = ps.findAllProductListMap();
//Iterator<Map<String,Object>> ii = listOfRec.iterator();
//while(ii.hasNext()) {
//	Map<String, Object> mm = ii.next();
//	System.out.println(mm);
//}

//Display records using List
	//List<Product> listOfProduct = ps.findAllProducts();
	List<Product> listOfProduct = ps.findProductByPrice(40000);
	//List<Product> listOfProduct = ps.findProductByGenerics();
	Iterator<Product> li = listOfProduct.iterator();
	while(li.hasNext()) {
		Product p = li.next();
		System.out.println(p);
	}

	}

}
