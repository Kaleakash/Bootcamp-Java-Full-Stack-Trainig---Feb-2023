package com.eshopping.admin.service;

import java.util.List;

import com.eshopping.admin.bean.Category;
import com.eshopping.admin.dao.CategoryDao;

public class CategoryService {

	CategoryDao cd  = new CategoryDao();
	
	public String storeCategory(Category category) {
		
			if(cd.storeCategory(category)>0) {
				return "Category details stored successfully";
			}else {
				return "Category details didn't store";
			}
	}
	
	public List<Category> findAllCategory() {
		return cd.findAllCategory();
	}
	
	public String deleteCategory(int cid) {
		if(cd.deleteCategory(cid)>0) {
			return "Category deleted successfully";
		}else {
			return "Category details didn't delete";
		}
	}
}
