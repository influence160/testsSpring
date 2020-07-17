package com.othmen.testspring.webmvctest2.t1;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rs1")
public class RestController1 {
	
	public RestController1() {
		System.out.println("RestController1");
	}

	//http://localhost:8080/spring-enable-web-mvc-test2/rs1/test1?aa=5&b=9 => 200
	//http://localhost:8080/spring-enable-web-mvc-test2/rs1/test1?aa=5&bbbbb=9	=> 500
	@RequestMapping(path = "/test")
	public String test(int aa, int b) {
		return new String("test aa = " + aa + " b = " + b);
	}

	@GetMapping(path = "/p1")
	public Person p1() {
		return new Person("oth", "tili", 35);
	}

	@GetMapping(path = "/p2/{id}")
	public Person p2(@PathVariable("id") int id) {
		return new Person("oth", "tili", id);
	}

	@GetMapping(path = "/p3/{id}")
	public String p3(@PathVariable("id") int id, @MatrixVariable MultiValueMap<String, Object> matrixVariables) {
		return matrixVariables.toString();
	}
}
