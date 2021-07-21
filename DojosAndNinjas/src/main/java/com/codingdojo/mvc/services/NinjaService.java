package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Ninja;
import com.codingdojo.mvc.repos.NinjaRepo;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepo ninjaRepo;
	
	public List<Ninja> findAllNinjas(){
		return ninjaRepo.findAll();
	}
	public Ninja findNinja(Long id) {
		Optional<Ninja> ninja = ninjaRepo.findById(id);
		if(ninja.isPresent()) {
			return ninja.get();
		}else {
			return null;
		}
	}
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public Ninja updateNinja(
			Long id,
			String firstName,
			String lastName,
			int age) {
		Ninja target = findNinja(id);
		target.setFirstName(firstName);
		target.setLastName(lastName);
		target.setAge(age);
		return ninjaRepo.save(target);
	}
	public void deleteNinja(Long id) {
		ninjaRepo.deleteById(id);
	}	
}

