package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Dojo;
import com.codingdojo.mvc.repos.DojoRepo;



@Service
public class DojoService {
	@Autowired
	private DojoRepo dojoRepo;
	
	public List<Dojo> findAllDojos(){
		return dojoRepo.findAll();
	}
	public Dojo finddojo(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		}else {
			return null;
		}
	}
	public Dojo createdojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	public Dojo updatedojo(
			Long id,
			String name) {
		Dojo target = finddojo(id);
		target.setName(name);
		return dojoRepo.save(target);
	}
	public void deletedojo(Long id) {
		dojoRepo.deleteById(id);
	}
}
