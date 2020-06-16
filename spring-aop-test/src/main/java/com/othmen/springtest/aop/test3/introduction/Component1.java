package com.othmen.springtest.aop.test3.introduction;

import org.springframework.stereotype.Component;

@Component
public class Component1 implements Interface1 {

	@Override
	public void test1() {
		System.out.println("Component1.test1()");
	}

}
