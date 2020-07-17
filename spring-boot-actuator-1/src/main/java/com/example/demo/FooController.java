package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.annotation.Timed;

@RestController
@RequestMapping("/foo")
@Timed
public class FooController {
	
	@Autowired
	FooRepository fooRepository;
	
	@RequestMapping("/add")
	public void add(@RequestParam("name") String name, @RequestParam("id") int id) {
		fooRepository.save(new Foo(id, name));
	}
	
	@RequestMapping(value="get-all")
	public Iterable<Foo> getAll() {
		return fooRepository.findAll();
	}

}
