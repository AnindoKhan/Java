package com.codingdojo.mvc.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.mvc.models.Category;

public interface CategoryRepo extends CrudRepository<Category, Long>{
	List<Category> findAll();
}
