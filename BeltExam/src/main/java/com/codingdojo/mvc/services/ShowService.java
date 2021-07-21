package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Rating;
import com.codingdojo.mvc.models.Show;
import com.codingdojo.mvc.repos.ShowRepo;

@Service
public class ShowService {
	@Autowired 
	private ShowRepo showRepo;
	
	public List<Show> allShows(){
		return showRepo.findAll();
	}
	public Show findShowById(Long id) {
		Optional<Show> show = showRepo.findById(id);
		
		if(show.isPresent()) {
			return show.get();
		}else {
			return null;
		}
	}
	public Show createShow(Show show) {
		return showRepo.save(show);
	}
	public Show updateShow(Long id, String title, String network) {
		Show target = findShowById(id);
		target.setTitle(title);
		target.setNetwork(network);
		return showRepo.save(target);
	}
	public void deleteShow(Long id) {
		showRepo.deleteById(id);
	}
//	public Show rateShow(Long id, Rating rate) {
//		Show target = findShowById(id);
//		target.setRatings(rate);
//		return showRepo.save(target);
//	}
	
	
}
