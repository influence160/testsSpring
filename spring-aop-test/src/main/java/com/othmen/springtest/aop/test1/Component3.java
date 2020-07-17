package com.othmen.springtest.aop.test1;

import org.springframework.stereotype.Component;

@Component("ccc3")
public class Component3 implements Interface31, Interface32{

	public void test1() {
		System.out.println("Component3.test1()");
	}

	@Override
	public void test2() {
		System.out.println("Component3.test2()");
		
	}
}
