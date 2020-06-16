package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.model.Aaa;

@Controller
@RequestMapping("/a")
public class ControllerA {
	
	@RequestMapping("/get1") 
	public String getA1(){
		return "a1";
	}

	
	@RequestMapping("/getAaa") 
	@ResponseBody
	public Aaa getAaa(){
		return new Aaa("aaa", 22, LocalDate.now());
	}

}
