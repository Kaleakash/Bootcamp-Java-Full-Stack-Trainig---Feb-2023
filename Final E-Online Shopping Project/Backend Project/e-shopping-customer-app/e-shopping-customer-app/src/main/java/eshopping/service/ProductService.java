package eshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import eshopping.bean.Product;

@Service
public class ProductService {

	@Autowired
	RestTemplate restTemplate;
	
	
	public List<Product> getAllProducts() {
		List<Product> listOfProduct = restTemplate.getForObject("http://E-SHOPPING-ADMIN-APP/phase3/admin/product/findAll", List.class);
		return listOfProduct;
	}
}
