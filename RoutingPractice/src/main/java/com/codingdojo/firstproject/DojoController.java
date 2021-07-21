package com.codingdojo.firstproject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DojoController {
	
	
	 @RequestMapping("{dojo}")
	    public String location(@PathVariable("dojo") String location){
		 if(location.equals("dojo")) {
	    	return "The dojo is awesome";
		}
	    if(location.equals("san-burbank")){
	    	return "Burbank dojo is located in southern california";
	    }
	    if (location.equals("san-jose")) {
	    	return "SJ dojo is the headquarters";
	    }
	    return null;
	
}	
}
