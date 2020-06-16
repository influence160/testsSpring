package com.othmen.springtest.aop.test3.introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspect1 {
	
	@DeclareParents(value = "com.othmen.springtest.aop.test3.introduction.Compone*", defaultImpl = DefaultImplInterface2.class)
	public static Interface2 interface2;

//	@Before("execution(* test1()) && this(Interface1)")
//	public void berfore1() {
//		System.out.println("before1");
//	}
	
	
}
