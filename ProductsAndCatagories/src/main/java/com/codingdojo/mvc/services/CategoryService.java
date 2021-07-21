package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Category;
import com.codingdojo.mvc.repos.CategoryRepo;

@Service
public class CategoryService {
	@Autowired
	CategoryRepo categoryRepo;
	public List<Category> findAllCategorys(){
		return categoryRepo.findAll();
	}
	public Category findById(Long id){
		Optional<Category> category = categoryRepo.findById(id);
		if (category.isPresent()) {
			return category.get();
		}else {
			return null;
		}
	}
	public Category createCategory(Category category){
		return categoryRepo.save(category);
	}
	public Category updateCategory( Category c) {
		return categoryRepo.save(c);
	}
	public void deleteCategory(Long id){
		categoryRepo.deleteById(id);
	}
	
	
	
	
}
