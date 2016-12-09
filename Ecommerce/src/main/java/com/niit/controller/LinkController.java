package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkController {

	@RequestMapping(value="/link")
public ModelAndView display(){
		
		String ms="Success";
		return new ModelAndView("login","ms",ms);
	}
}
