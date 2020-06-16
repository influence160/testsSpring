package com.othmen.testspring.springcore.annotationbased.beans1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A3 {
	
	@Autowired
	private A a;
	
	public A getA() {
		return a;
	}

}
