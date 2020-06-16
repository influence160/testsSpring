package com.othmen.springtest.aop.test3.per;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect("perthis(com.othmen.springtest.aop.test3.per.Aspect0.pontcut1())")
//@Component
public class Aspect1 {
	
	private int calls = 0;
	
	@Before("com.othmen.springtest.aop.test3.per.Aspect0.pontcut1()")
	public void berfore1() {
		calls++;
		System.out.println("before1 " + calls);
	}
	
	
}
