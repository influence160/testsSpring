package com.othmen.testspring.springcore.annotationbased.beans4;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

@Named
public class A3 {
	
	@Autowired
	private A a1;
	

	@Resource
	private A a4;

//	@Autowired
//	public void setA1(A a1) {
//		this.a1 = a1;
//	}

	public A getA() {
		return a1;
	}
	
	public A getA4() {
		return a4;
	}

}
