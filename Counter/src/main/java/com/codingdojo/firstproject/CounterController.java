package com.codingdojo.firstproject;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("")
	public String index(HttpSession session){
		return "index.jsp";
	}

	@RequestMapping("/counter")
	
	public String counter(HttpSession session, Model model) {
        Object count = (Integer) session.getAttribute("count");
        if (count == null) {
        	count = 0;
        }
        session.setAttribute("count",(Integer) session.getAttribute("count")+1);
		Object counter = (Integer) session.getAttribute("count");
		model.addAttribute("counter", counter);
		return "counter.jsp";
	}
	
}
