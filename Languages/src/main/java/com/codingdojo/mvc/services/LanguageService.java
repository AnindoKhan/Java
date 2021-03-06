package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Language;
import com.codingdojo.mvc.repository.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
	
	public LanguageService (LanguageRepository languageRepository) {
		this.languageRepository=languageRepository;
	}
	public List<Language> allLanguages(){
		return languageRepository.findAll();
	}
	public Language createLanguage(Language l){ 
		return languageRepository.save(l);
	}
	public Language findLanguage(Long id){
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
		
	}
	public Language updateLanguage(
			Long id, 
			String name, 
			String creator, 
			String version) {
		Language target = findLanguage(id);
		target.setName(name);
		target.setCreator(creator);
		target.setVersion(version);
		return languageRepository.save(target);
	}
	public void deleteLanguage(Long id) {
		languageRepository.deleteById(id);
	}
}

