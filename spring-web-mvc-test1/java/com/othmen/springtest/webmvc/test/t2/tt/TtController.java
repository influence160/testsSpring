package com.othmen.springtest.webmvc.test.t2.tt;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.othmen.springtest.webmvc.test.t2.root.Service1;

@RestController
@RequestMapping("/tt")
public class TtController {
	
	@Inject
	private Service1 service1;

	public TtController() {
		System.out.println("TtController");
	}
	
	@GetMapping
	public String get1() {
		return "tt get1 " + service1.service1Call();
	}
	
}
