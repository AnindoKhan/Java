package com.codingdojo.mvc.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.License;
import com.codingdojo.mvc.models.Person;
import com.codingdojo.mvc.repos.LicenseRepo;
@Service
public class LicenseService {
	@Autowired
	private LicenseRepo licenseRepo;
	
	public List<License> findAlllicenses(){
		return licenseRepo.findAll();
	}
	public License findLicense(Long id) {
		Optional<License> license=  licenseRepo.findById(id);
		if(license.isPresent()) {
			return license.get();
		}else {
			return null;
		}
	}
	public License createLicense(License p){
		return licenseRepo.save(p);
	}
	public License updateLicense(
			Long id,
			String number, 
			Date expirationDate, 
			String state, 
			Person person){
		License target = findLicense(id);
		target.setNumber(number);
		target.setPerson(person);
		target.setExpirationDate(expirationDate);
		target.setState(state);
		return licenseRepo.save(target);
	}
	public void deleteLicense(Long id){
		licenseRepo.deleteById(id);
	}
}
