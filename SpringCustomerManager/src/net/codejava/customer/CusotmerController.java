package net.codejava.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CusotmerController {
	
	@Autowired @Qualifier("customerService")
	private CustomerService customerService;
	
	/*@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav= new ModelAndView("index");
		mav.addObject("message","Hello from Spring MVC");
		return mav;		
	}*/
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav= new ModelAndView("index");		
		List<Customer> listCustomer = customerService.listAll();
		mav.addObject("listCustomer",listCustomer);
		return mav;		
	}
}
