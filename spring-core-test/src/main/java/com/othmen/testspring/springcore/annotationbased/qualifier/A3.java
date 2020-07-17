package com.othmen.testspring.springcore.annotationbased.qualifier;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class A3 {
	
	@Autowired
	private A a1;
	
	private A a4;

	@Autowired
	public void setA3(@Qualifier("a2")A a4) {
		this.a4 = a4;
	}

	public A getA() {
		return a1;
	}
	
	public A getA4() {
		return a4;
	}

}
