package com.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.mvc.User;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Locale locale, Model model){
		System.out.println(" Home page requested, locale  "+locale);
		Date date = new Date();
		DateFormat dtFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, locale);
		String formattedDate =dtFormat.format(date);
		System.out.println("formattedDate"+formattedDate);
		model.addAttribute("serverTime",formattedDate);
		System.out.println("formattedDate"+model.getAttribute("serverTime"));
		return "home";
	}

@RequestMapping(value="/user", method=RequestMethod.POST)
public String userDetails(@Validated User user, Model model){
	System.out.println("User page Requested ");
	model.addAttribute("userName",user.getUserName());
	return "user";
}
	
}
