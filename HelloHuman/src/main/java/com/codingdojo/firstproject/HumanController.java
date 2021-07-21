package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String name(@RequestParam(value = "name", required = false) String fname, String lname) {
		if(fname == null) {
			return "<h1> Hello Human!</h1><P> welcome to SpringBoot!</p>";
		}else if(lname == null) {
			return "<h1>Hello " + fname + "!</h1><p>Welcome to SpringBoot!</p>";
		}else {
			return "<h1> Hello " + fname + " " + lname + "!</h1> <p>Welcome to Springboot!</p>";
		}
	}
	
}
