package com.othmen.springtest.aop.test2;

import org.springframework.stereotype.Component;

@Component
public class Component1 implements Interface1 {

	@Override
	public void test1() {
		System.out.println("Component1.test1()");
	}

}
