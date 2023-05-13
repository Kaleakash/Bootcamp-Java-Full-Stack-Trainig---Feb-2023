package com;

import java.util.ArrayList;
import java.util.List;

import bean.Product;

public class ProductMainClass {

	public static void main(String[] args) {
	List<Product> listOfProduct = new ArrayList<Product>();

	listOfProduct.add(new Product(100, "TV", 75000));
	listOfProduct.add(new Product(101, "Computer", 25000));
	listOfProduct.add(new Product(102, "Laptop", 98000));
	listOfProduct.add(new Product(103, "Mobile", 55000));
	listOfProduct.add(new Product(104, "Pen Drive", 2200));
	
//	boolean result = listOfProduct.stream().allMatch(v->v.getPrice() > 5000);
//	System.out.println(result);
	
//	boolean result = listOfProduct.stream().anyMatch(v->v.getPrice() > 95000);
//	System.out.println(result);
	
	listOfProduct.stream().filter(p->p.getPrice()>50000).forEach(v->System.out.println(v));
	}

}
