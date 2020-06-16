package com.othmen.springtest.webmvc.test.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.othmen.springtest.webmvc.test.t2.root.Service1;

@RestController()
@RequestMapping("/rest-controller1")
public class RestController1 {
	 
	private Service1 service1; 
	
	public RestController1(Service1 service1) {
		System.out.println("RestController1");
		this.service1 = service1;
	}
	
	@GetMapping(path = "/get1")
	public String get1() {
		System.out.println("get1");
		return "get1 " + service1.service1Call();
	}
		
	@GetMapping(path = "/{matrix}")
	public String getMatrix() {
		System.out.println("get1");
		return "getMatrix ";
	}
	
	//http://localhost:8080/spring-web-mvc-test1/t2/rest-controller1/getMv1/99;mv1=44;d=55
	@GetMapping(path = "/getMv1/{cc}")
	public String getMatrix2(@PathVariable("cc") String cc, @MatrixVariable MultiValueMap<String, String> matrixVars) {
		System.out.println("get1");
		return "getMatrix2" + "\n"
				+ "matrixVars = " + matrixVars;
	}
	
	
	@GetMapping()
	public String getAll() {
		System.out.println("getAll");
		return "all" + service1.service1Call();
	}
	
	@GetMapping(path = "/getException")
	public String getException() {
		throw new RuntimeException("azdazdfkjgfh dkjlfhslfh kjqshjjkl");
	}

}
