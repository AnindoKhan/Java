package com.codingdojo.mvc.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.models.Person;

@Repository
public interface PersonRepo extends CrudRepository<Person, Long> {
	List<Person> findAll();
	}
