package com.othmen.springtest.aop.test1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogCallMethodAspect {
	
	
	@Pointcut("execution(* get*(..))")
	public void pontcutGet1() {
		
	}
	
	@Pointcut("execution(* com.othmen.springtest..get*(..))")
	public void pontcutGet2() {
		
	}
	
	@Pointcut("execution(* com.othmen.springtest.aop.test1..*(..))")
	public void pontcutAll() {
		
	}

	@Before("com.othmen.springtest.aop.test1.LogCallMethodAspect.pontcutGet1()")
	public void logCallMethod1() {
		System.out.println("logCallMethod1");
	}

	@Before("pontcutGet2() && within(com.othmen.springtest.aop.test1.Component1)")
	public void logCallMethod2() {
		System.out.println("logCallMethod2");
	}

	@Before("pontcutAll()")
	public void logCallMethod3() {
		System.out.println("logCallMethod3");
	}
}
