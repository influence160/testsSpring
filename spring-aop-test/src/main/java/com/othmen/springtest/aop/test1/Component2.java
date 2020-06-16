package com.othmen.springtest.aop.test1;

import org.springframework.stereotype.Component;

@Component
public class Component2 {
	
	public void getValue1() {
		System.out.println("component 1, value 1");
	}
	
	public void getValue2(int i) {
		System.out.println("component 1, value 2, argument "+ i);
	}

	public void printValue3() {
		System.out.println("component 1, value 3");
	}

}
