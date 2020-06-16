package com.othmen.springtest.aop.test1;

import org.springframework.stereotype.Component;

@Component
public class Component1 {
	
	public void getValue1() {
		System.out.println("component 1, value 1");
	}
	
	public void getValue2() {
		System.out.println("component 1, value 2");
	}

	public void printValue3() {
		System.out.println("component 1, value 3");
	}

}
