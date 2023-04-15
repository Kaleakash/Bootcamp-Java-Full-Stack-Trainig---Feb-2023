package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;

public class ProductService {
	private List<Product> listOfProduct = new ArrayList<Product>();
	
	public String storeProduct(Product product) {
		int temp=0;
				if(listOfProduct.size()==0) {
					listOfProduct.add(product);
					return "Product added successfully";
				}else {
					Iterator<Product> ii = listOfProduct.iterator();
					while(ii.hasNext()) {
						Product p = ii.next();
						if(p.getPid()==product.getPid()) {
							temp++;
						}
					}
					if(temp==0) {
						listOfProduct.add(product);
						return "Product added successfully";
					}else {
						return "Product id must be unique";
					}
				}
	}
	
	public int sizeOfProduct() {
		return listOfProduct.size();
	}
}
