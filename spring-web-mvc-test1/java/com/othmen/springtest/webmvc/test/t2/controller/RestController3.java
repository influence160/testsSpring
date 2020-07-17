package com.othmen.springtest.webmvc.test.t2.controller;

import java.time.LocalDate;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.othmen.springtest.webmvc.test.t2.Views;

@RestController()
@RequestMapping("/rest-controller3")
public class RestController3 {

	
	public RestController3() {
		System.out.println("RestController3");
	}
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		// binder.addValidators(new FooValidator());
		System.out.println("initBinder");
		System.out.println(".canConvert(String.class, Person.class) = " + binder.getConversionService().canConvert(String.class, Person.class));
	}
	
	@ModelAttribute
	public void attributJour(Model model) {
		model.addAttribute("jour", LocalDate.now().getDayOfMonth());
	}
	
	@RequestMapping("/get1")
	public Person get1(@ModelAttribute("jour") int day) {
		System.out.println();
		return new Person("othmen", "tiliouine", 35);
	}
	
	@RequestMapping("/get-string")
	public ResponseEntity<String> getString(@ModelAttribute("jour") int jour) {
		return ResponseEntity.ok().body("kkkkkkkk " + jour);
	}

	
	@RequestMapping(path = "/get2", produces = MediaType.APPLICATION_JSON_VALUE)
	@JsonView(Views.Public.class)
	public Person get2() {
		return new Person("othmen", "tiliouine", 35);
	}
}
