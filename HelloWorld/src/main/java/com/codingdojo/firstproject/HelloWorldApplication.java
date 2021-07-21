package com.codingdojo.firstproject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	  @RequestMapping("/")
      
      public String hello() {
              return "Hello Client! How are you doing today?";
	  }
	 @RequestMapping("/random")
	 public String random() {
		 return "Spring boot is great! So easy just responding with strings";
	 }
	  
}
