package com.othmen.springtest.webmvc.test.t2.root;

import org.springframework.stereotype.Service;

@Service
public class Service1 {
	
	public Service1() {
		System.out.println("Service1");
	}

	public String service1Call() {
		return "service1 call";
	}
}
