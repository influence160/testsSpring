package com.othmen.springtest.webmvc.test.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.othmen.springtest.webmvc.test.t2.root.Service1;

@RestController()
@RequestMapping("/rest-controller2")
public class RestController2 {
	 
	private Service1 service1; 
	
	public RestController2(Service1 service1) {
		System.out.println("RestController2");
		this.service1 = service1;
	}
	
	@GetMapping(path = "/get1")
	public String get1() {
		System.out.println("get1");
		return "bbb" + service1.service1Call();
	}
	
	@GetMapping()
	public String getAll() {
		System.out.println("getAll");
		return "all" + service1.service1Call();
	}
	
	@GetMapping(path = "/getException")
	public String getException() {
		throw new RuntimeException("kkkkkkkkkkkkkkkkkkkkkkzf efz ef");
	}

}
