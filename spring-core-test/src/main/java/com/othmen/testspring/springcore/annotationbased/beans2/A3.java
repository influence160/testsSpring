package com.othmen.testspring.springcore.annotationbased.beans2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A3 {
	
	@Autowired
	private A a1;

	public A3() {
	}

	
//	@Autowired(required = false)
//	public A3(A a1) {
//		this.a1 = a1;
//	}
//	
//	@Autowired(required = false)
//	public A3(A1 a1) {
//		this.a1 = a1;
//	}
	
	
	public void setA1(A a1) {
		this.a1 = a1;
	}
	
	public A getA() {
		return a1;
	}

}
