package com.othmen.testspring.springcore.annotationbased.beans3;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

@Named
public class A3 {
	
	@Resource
	private A a1;
	
//	@Inject
//	@Autowired
	@Resource
	private A4 abc4;

//	@Autowired
//	public void setA1(A a1) {
//		this.a1 = a1;
//	}

	public A getA() {
		return a1;
	}
	
	public A4 getA4() {
		return abc4;
	}

}
