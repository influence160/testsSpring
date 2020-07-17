package com.othmen.springtest.aop.test1;

import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectWithinTarget3 {

	@AfterReturning(value = "within(Component3)")
	public void testWithinComponent3() {
		System.out.println("After returning within Component3");
	}
	
	@AfterReturning(value = "within(Interface31)")
	public void testWithinInterface31() {
		System.out.println("After returning within Interface31");
	}
	
	@AfterReturning(value = "within(Interface32)")
	public void testWithinInterface32() {
		System.out.println("After returning within Interface32");
	}


	@AfterReturning(value = "target(Component3)")
	public void testTargetComponent3() {
		System.out.println("After returning target Component3");
	}
	
	@AfterReturning(value = "target(Interface31)")
	public void testTargetInterface31() {
		System.out.println("After returning target Interface31");
	}

	@AfterReturning(value = "this(Component3)")
	public void testThisComponent3() {
		System.out.println("After returning this Component3");
	}
	
	@AfterReturning(value = "this(com.othmen.springtest.aop.test1.Interface31)")
	public void testThisInterface31() {
		System.out.println("After returning this Interface31");
	}

}
