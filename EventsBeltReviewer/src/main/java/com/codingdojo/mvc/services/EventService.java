package com.codingdojo.mvc.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Event;
import com.codingdojo.mvc.repos.EventRepo;



@Service
public class EventService {
	@Autowired
	private EventRepo eventRepo;
	
	public List<Event> allEvents(){
		return eventRepo.findAll();
	}
	public Event findEventById(Long id){
		Optional<Event> event = eventRepo.findById(id);
		if(event.isPresent()) {
			return event.get();
		} else {
			return null;
		}
	}
	public Event saveEvent(Event e) {
		return eventRepo.save(e);
	}
	public void deleteEvent(Long id) {
		eventRepo.deleteById(id);
	}
	public List<Event> findStateEvents(String state, boolean b){
		if (b== true) {
			return eventRepo.findByState(state);
		}else {
			return eventRepo.findByStateNot(state);
		}
	}
}
