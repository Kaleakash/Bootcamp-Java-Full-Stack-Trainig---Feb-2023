package com.eshopping.admin.service;

import java.util.List;

import com.eshopping.admin.bean.Product;
import com.eshopping.admin.dao.CategoryDao;
import com.eshopping.admin.dao.ProductDao;

public class ProductService {
	ProductDao pd = new ProductDao();
	//CategoryDao cd = new CategoryDao();
	public String storeProduct(Product product) {
//		int categoryId = cd.findCategoryId(product.getCategory());
//		product.setCid(categoryId);
		if(pd.storeProduct(product)>0) {
			return "Product details stored successfully";
		}else {
			return "Product didn't store";
		}
	}
	
	public List<Product> findAllProducts() {
		return pd.findAllProducts();
	}
}
