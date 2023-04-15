package com.main;

import com.bean.Product;
import com.service.ProductService;

public class App {

	public static void main(String[] args) {
		ProductService ps = new ProductService();
		Product p1 = new Product(1, "Tv", 45000);
		//Product p2 = new Product(2, "Computer", 34000);
		String result = ps.storeProduct(p1);
		System.out.println(result);
		p1 = new Product(2, "Computer", 34000);
		result = ps.storeProduct(p1);
		System.out.println(result);
		result = ps.storeProduct(p1);
		System.out.println(result);
		
		int length = ps.sizeOfProduct();
		System.out.println(length);
	}

}
