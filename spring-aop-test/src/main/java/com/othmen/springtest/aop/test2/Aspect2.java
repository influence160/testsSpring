package com.othmen.springtest.aop.test2;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspect2 implements Ordered {


	@Override
	public int getOrder() {
		return 20;
	}
	
	@Before("execution(* test1()) && this(Interface1)")
	public void berfore1() {
		System.out.println("before2");
	}
	
	@AfterReturning("execution(* test1()) && this(Interface1)")
	public void after1() {
		System.out.println("after2");
	}
	
}
