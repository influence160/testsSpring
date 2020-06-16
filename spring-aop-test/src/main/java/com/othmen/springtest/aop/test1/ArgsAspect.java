package com.othmen.springtest.aop.test1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ArgsAspect {
	
//	@Pointcut(value="this(Interface4) && @annotation(testAnnotation)")
//	public void pointcut1() {
//		
//	}
	
//	@Before(value="pointcut1(testAnnotation)")
	@Before(value = "this(Interface4) && @annotation(ta)", argNames = "ta")
	public void beforeTest1(TestAnnotation testAnnotation) {
		System.out.println("beforeTest1");
		System.out.println(testAnnotation.caca());
	}

}
