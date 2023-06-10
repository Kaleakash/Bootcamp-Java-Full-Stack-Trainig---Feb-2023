package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service   // it is service layer specific annotation 
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String storeProduct(Product product) {
		if(productDao.storeProduct(product)>0) {
			return "Product stored";
		}else {
			return "Product didn't store";
		}
	}
	public String updateProduct(Product product) {
		if(productDao.updateProduct(product)>0) {
			return "Product details updated successfully";
		}else {
			return "Product didn't update";
		}
	}

	public String deleteProduct(int pid) {
		if(productDao.deleteProduct(pid)>0) {
			return "Product details deleted successfully";
		}else {
			return "Product didn't delete";
		}
	}
	public List<Map<String, Object>> findAllProductListMap() {
		
		return productDao.findProductUsingListMap();
	}
	public List<Product> findAllProducts() {
		
		return productDao.findAllProductObject();
	}
	
	public List<Product> findProductByPrice(float price){
		return productDao.findAllProductObject(price);
	}
	
	
}
