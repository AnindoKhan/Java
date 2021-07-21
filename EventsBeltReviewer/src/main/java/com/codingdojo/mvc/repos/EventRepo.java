package com.codingdojo.mvc.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.models.Event;


@Repository
public interface EventRepo extends CrudRepository<Event, Long> {
	List<Event>findAll();
	public List<Event> findByState(String state);
	public List<Event> findByStateNot(String state);
}
