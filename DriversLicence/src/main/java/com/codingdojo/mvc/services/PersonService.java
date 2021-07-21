package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Person;
import com.codingdojo.mvc.repos.PersonRepo;
@Service
public class PersonService {
	@Autowired
	private PersonRepo personRepo;
	
	public List<Person> findAllPersons(){
		return personRepo.findAll();
	}
	public Person findPerson(Long id) {
		Optional<Person> person=  personRepo.findById(id);
		if(person.isPresent()) {
			return person.get();
		}else {
			return null;
		}
	}
	public Person createPerson(Person p){
		return personRepo.save(p);
	}
	public Person updatePerson(
			Long id,
			String firstName,
			String lastName){
		Person target = findPerson(id);
		target.setFirstName(firstName);
		target.setLastName(lastName);
		return personRepo.save(target);
	}
	public void deletePerson(Long id){
		personRepo.deleteById(id);
	}
}

