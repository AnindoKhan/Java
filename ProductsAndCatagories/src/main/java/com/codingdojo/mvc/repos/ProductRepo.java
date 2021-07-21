package com.codingdojo.mvc.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.models.Product;

@Repository
public interface ProductRepo extends CrudRepository <Product, Long>{
	List<Product> findAll();
}
