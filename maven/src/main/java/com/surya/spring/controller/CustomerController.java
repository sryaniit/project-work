package com.surya.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.surya.spring.model.Customer;
import com.surya.spring.service.CustomerService;

@Controller
@RequestMapping("/login")
public class CustomerController {
	
	private CustomerService customerService;

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	

}
