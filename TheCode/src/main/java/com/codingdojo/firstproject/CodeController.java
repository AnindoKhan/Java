package com.codingdojo.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping (value="/code", method = RequestMethod.POST)
	public String code(@RequestParam(value = "guess") String guess,RedirectAttributes redirectAttributes){
		if("bushido".equals(guess)) {
			return "code.jsp";
		}
		else {
			
			redirectAttributes.addFlashAttribute("error","You need to train harder");
			return "redirect:/";
			}
		}
	}



