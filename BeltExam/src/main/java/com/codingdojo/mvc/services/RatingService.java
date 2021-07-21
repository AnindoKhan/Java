package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Rating;
import com.codingdojo.mvc.repos.RatingRepo;

@Service
public class RatingService {
	@Autowired
	RatingRepo ratingRepo;

	public List<Rating> allRatings(){
		return ratingRepo.findAll();
	}
	public Rating findRatingById(Long id) {
		Optional<Rating> rating = ratingRepo.findById(id);
		
		if(rating.isPresent()) {
			return rating.get();
		}else {
			return null;
		}
	}
	public Rating createRating(Rating show) {
		return ratingRepo.save(show);
	}
//	public Show updateShow(Long id, String rating ) {
//		Show target = findRatingById(id);
//		target.setRatings(ratings);
//		return ratingRepo.save(target);
//	}
	public void deleteRating(Long id) {
		ratingRepo.deleteById(id);
	}
}
