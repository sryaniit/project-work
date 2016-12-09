package com.surya.spring.controller;

import javax.enterprise.inject.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("contact")
	public String getContactUs(Model m)
	{
		return "ContactUs";
	}

}
