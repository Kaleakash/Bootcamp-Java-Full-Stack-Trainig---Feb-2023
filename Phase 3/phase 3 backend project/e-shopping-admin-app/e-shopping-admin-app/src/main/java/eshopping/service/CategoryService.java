package eshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eshopping.entity.Category;
import eshopping.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public String storeCategory(Category category) {
		categoryRepository.save(category);
		return "Category details stored successfully";
	}
	public List<Category> findAllCategory() {
		return categoryRepository.findAll();
	}
	
	public List<Category> searchCategoryByName(String categoryName){
		return categoryRepository.searchCategoryByName(categoryName);
	}
	
	public String deleteCategory(int cid) {
		Optional<Category> result = categoryRepository.findById(cid);
		if(result.isPresent()) {
		   categoryRepository.deleteById(cid);
		   return "Category record deleted successfully";
		}else {
			return "Category not present";
		}
	}
}
