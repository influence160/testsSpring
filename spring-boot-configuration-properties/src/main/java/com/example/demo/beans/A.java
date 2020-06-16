package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	
	@Autowired
	private MyObject myObject;
	
	public void printMyObject() {
		System.out.println(myObject.isEnabled());
		System.out.println(myObject.getName());
		System.out.println(myObject.getListStrings());
		System.out.println(myObject.getMapStrings());
	}

}
