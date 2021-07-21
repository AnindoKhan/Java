package com.codingdojo.mvc.repos;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.models.Rating;

@Repository
public interface RatingRepo extends CrudRepository <Rating, Long>{
	List<Rating> findAll();
}
