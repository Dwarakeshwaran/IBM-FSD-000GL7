package com.spring.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	
	@Autowired
	private CustomerService customerServices;

	@GetMapping("/index")
	public String Home() {
		return "Hello";
	}

	@GetMapping("/customer")	
	public List<Customer> getCustomer() {
		return customerServices.getCustomer();
	}

}
