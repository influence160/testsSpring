package com.othmen.springtest.webmvc.test.t2.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(assignableTypes = RestController2.class)
public class T2ControllersAdvice {

	
	@ExceptionHandler
	@ResponseBody
	public String handlerExceptions(Exception e) {
		return "EXCEPTION : " + e.getMessage();
	}
}
