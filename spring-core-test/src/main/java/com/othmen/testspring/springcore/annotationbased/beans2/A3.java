package com.othmen.testspring.springcore.annotationbased.beans2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A3 {
	
	@Autowired
	private A a1;

//	@Autowired
//	public void setA1(A a1) {
//		this.a1 = a1;
//	}
	
	public A getA() {
		return a1;
	}

}
