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
	
	public Product findProduct(int pid) {
		Iterator<Product> ii = listOfProduct.iterator();
		while(ii.hasNext()) {
			Product p = ii.next();
			if(p.getPid()==pid) {
				return p;
			}
		}
		return null;
	}
	
	public List<Product> findAllProduct() {
		return listOfProduct;
	}
	
	public String updateProductPrice(Product product) {		// 100, 75000;
		int temp=0;
		Iterator<Product> ii = listOfProduct.iterator();
		while(ii.hasNext()) {
			Product p = ii.next();
			if(p.getPid()==product.getPid()) {
					p.setPrice(product.getPrice());  // old price replace by new price
				temp++;
			}
		}
		if(temp==0) {
			return "Product not present";
		}else {
			temp=0;
			return "Product updated successfully";
		}
	}
	
	public String deleteProductById(int pid) {		
		int temp=0;
		Iterator<Product> ii = listOfProduct.iterator();
		while(ii.hasNext()) {
			Product p = ii.next();
			if(p.getPid()==pid) {
					ii.remove();
				temp++;
			}
		}
		if(temp==0) {
			return "Product not present";
		}else {
			temp=0;
			return "Product deleted successfully";
		}
	}
}





