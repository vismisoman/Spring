package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Addition {

	/*@RequestMapping("/")
	public ModelAndView display(){
		ModelAndView mav= new ModelAndView("index");	
		return mav;
	}*/
	@RequestMapping("/")
	public String display1(){	
		return "index";
	}
}
