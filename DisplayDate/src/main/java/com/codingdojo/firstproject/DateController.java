package com.codingdojo.firstproject;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DateController {
    @RequestMapping("")
    public String index() {
        return "index.jsp";
    }
    @RequestMapping("/date")
    
    public String date(Model model) {
    	Date Date = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("EEEEEEEE', the' dd 'of ' MMMMMMMM',' yyyy");
    	String dateFormat = sdf.format(Date);
        model.addAttribute("date",dateFormat);
        return "date.jsp";
     
    }
    @RequestMapping("/time")
    public String time (Model model) {
    	Date time = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");
    	String timeFormat = sdf.format(time);
    	model.addAttribute("time", timeFormat);
    	return "time.jsp";
    }
       
}