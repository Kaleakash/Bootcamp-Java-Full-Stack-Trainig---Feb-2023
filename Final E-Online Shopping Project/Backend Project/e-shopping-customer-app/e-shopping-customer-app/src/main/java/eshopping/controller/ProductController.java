package eshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eshopping.bean.Product;
import eshopping.service.ProductService;

@RestController
@RequestMapping("phase3/customer/product")
@CrossOrigin	
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAllProduct() {
		return productService.getAllProducts();
	}
}
