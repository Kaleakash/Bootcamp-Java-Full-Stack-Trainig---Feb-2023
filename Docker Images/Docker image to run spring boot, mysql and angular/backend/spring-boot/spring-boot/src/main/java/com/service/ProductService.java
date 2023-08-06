package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public String storeProduct(Product product) {
		productRepository.save(product);
		return "Record saved successfully";
	}
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}
}
