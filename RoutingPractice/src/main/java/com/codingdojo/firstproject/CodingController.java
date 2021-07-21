package com.codingdojo.firstproject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String index() {
		return "Hello Coding Dojo";
	}
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was Awesome";
	}
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better!";
	}

}
