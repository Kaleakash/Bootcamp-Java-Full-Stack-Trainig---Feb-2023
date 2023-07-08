package eshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eshopping.entity.Category;
import eshopping.service.CategoryService;

@RestController
@RequestMapping("phase3/admin/category")
@CrossOrigin
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCategory(@RequestBody Category category) {
		return categoryService.storeCategory(category);
	}
	
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Category> findAllCategory() {
		return categoryService.findAllCategory();
	}
//	@GetMapping(value = "search/{categoryName}",produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Category> searchCategoryByName(@PathVariable("categoryName") String categoryName){
//		return categoryService.searchCategoryByName(categoryName);
//	}
	
	@PostMapping(value = "search",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Category> searchCategoryByName(@RequestBody Category category){
		return categoryService.searchCategoryByName(category.getCategoryName());
	}
	
	@DeleteMapping(value = "deleteCategory")
	public String deleteCategoryById(@RequestParam("cid") int cid) {
		return categoryService.deleteCategory(cid);
	}
}




