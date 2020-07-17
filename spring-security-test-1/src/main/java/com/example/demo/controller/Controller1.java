package com.example.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("c1")
public class Controller1 {
	

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	@ResponseBody
	public String test1() {
		return "test1";
	}
	
	@RequestMapping("/admin1")
	@ResponseBody
	public String admin1(java.security.Principal principal) {
		String s = "tu pourra pas y acceder si t es pas admin\ntu es ";
		s+= SecurityContextHolder.getContext().getAuthentication().getAuthorities().toString();
		return s;
	}
}
