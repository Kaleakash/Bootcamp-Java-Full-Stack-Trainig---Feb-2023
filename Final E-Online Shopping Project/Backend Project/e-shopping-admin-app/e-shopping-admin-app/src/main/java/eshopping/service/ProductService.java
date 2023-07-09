package eshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eshopping.entity.Product;
import eshopping.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	
	public String storeProduct(Product product) {
		productRepository.save(product);
		return "Product record stored successfully";
	}
	
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}
	
	public String deleteProductById(int pid) {
		Optional<Product> result = productRepository.findById(pid);
		if(result.isPresent()) {
			productRepository.deleteById(pid);
			return "Product details deleted successfully";
		}else {
			return "Product not present";
		}
			
	}
	
	public String updateProduct(Product product) {
		Optional<Product> result = productRepository.findById(product.getPid());
		if(result.isPresent()) {
			Product p  = result.get();
			
			p.setStock(product.getStock());
			p.setPrice(product.getPrice());
			p.setDiscountPercentage(product.getDiscountPercentage());
			p.setThumbnail(product.getThumbnail());
			productRepository.saveAndFlush(p);
			return "Product details updated successfully";
		}else {
			return "Product not present";
		}
	}
}
