package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Category;
import com.codingdojo.mvc.models.Product;
import com.codingdojo.mvc.repos.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;
	public List<Product> findAllProducts(){
		return productRepo.findAll();
	}
	public Product findById(Long id){
		Optional<Product> product = productRepo.findById(id);
		if (product.isPresent()) {
			return product.get();
		}else {
			return null;
		}
	}
	public Product createProduct(Product product){
		return productRepo.save(product);
	}
	public Product updateProduct( Product p) {
		return productRepo.save(p);
	}
	public void deleteProduct(Long id){
		productRepo.deleteById(id);
	}
	public Product addCategory(Long id, Category category) {
		Product product = findById(id);
		List<Category> categories = product.getCategories();
		categories.add(category);
		product.setCategories(categories);
		return updateProduct(product);
	}
	
}
