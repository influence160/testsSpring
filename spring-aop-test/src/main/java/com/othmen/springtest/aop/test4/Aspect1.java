package com.othmen.springtest.aop.test4;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspect1 {



	@Before("execution(@com.othmen.springtest.aop.test4.CustomAnnotation public void *..*.test1())")
	public void berfore1() {
		System.out.println("before1");
	}
	
	@Before("execution(@com.othmen.springtest.aop.test4.CustomAnnotation * *..*.test1())")
	public void berfore12() {
		System.out.println("before12");
	}
	
	@AfterReturning("execution(public * *..*.test1()))")
	public void after1() {
		System.out.println("after1");
	}

	@Before("execution(public com.othmen.springtest.aop.test4.CustomAnnotation *..*.test2())")
	public void berfore2() {
		System.out.println("before2");
	}
	
	@AfterReturning("execution(public * *..*.test2()))")
	public void after2() {
		System.out.println("after2");
	}
	
	
	//@com.othmen.springtest.aop.test4.CustomAnnotation a la place de (@com.othmen.springtest.aop.test4.CustomAnnotation *)ne compile pas
	@Before("execution(public (@com.othmen.springtest.aop.test4.CustomAnnotation *) *..*.test3())")
	public void berfore3() {
		System.out.println("before3");
	}
	
	@AfterReturning("execution(public * *..*.test3()))")
	public void after3() {
		System.out.println("after3");
	}

	//----------------------------

	@Before("execution(public com.othmen.springtest.aop.test4.Component1 *..*.test2())")
	public void berfore22() {
		System.out.println("before22");
	}
	
	
	@Before("execution(public com.othmen.springtest.aop.test4.CustomAnnotation *..*.test3())")
	public void berfore32() {
		System.out.println("before32");
	}
	

	
}
