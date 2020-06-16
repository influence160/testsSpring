package com.othmen.testspring.springcore.classpathscanningandmanagedcomponent.beans1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A3 {
	
	public A3(@Autowired A a) {
		this.a = a;
	}
	
	
	private A a;
	
	public A getA() {
		return a;
	}

}
