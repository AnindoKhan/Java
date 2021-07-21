package com.codingdojo.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NinjaController {
	@RequestMapping("")
	public String home() {
	System.out.println("blahblah");
	return "index.jsp";
	}
	@RequestMapping(value = "/gold", method = RequestMethod.POST)
	public String game(
			@RequestParam String action) {
		
		
	}
}
