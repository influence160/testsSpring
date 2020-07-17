package com.othmen.springtest.aop.test5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspect1 {



	/////////////////////// test execution(@CustomAnnotation public void *.test1())
	
	@Before("execution(public void *.test1())")
	public void before11() {
		System.out.println("before11 execution(public void *.test1())");
	}


	@Before("execution(@com.othmen.springtest.aop.test5.CustomAnnotationClasse public void *.test1())")
	public void before12() {
		System.out.println("before12 execution(@com.othmen.springtest.aop.test5.CustomAnnotationClasse public void *..*.test1())");
	}
	
	@Before("execution(@com.othmen.springtest.aop.test5.CustomAnnotationInterface public void *.test1())")
	public void before13() {
		System.out.println("before13 execution(@com.othmen.springtest.aop.test5.CustomAnnotationInterface public void *.test1())");
	}
	
	@Before("execution(@com.othmen.springtest.aop.test5.CustomAnnotationMethodeClasse public void *.test1())")
	public void before14() {
		System.out.println("before14 execution(@com.othmen.springtest.aop.test5.CustomAnnotationMethodeClasse public void *.test1())");
	}
	
	@Before("execution(@com.othmen.springtest.aop.test5.CustomAnnotationMethodeInterface public void *.test1())")
	public void before15() {
		System.out.println("before15 execution(@com.othmen.springtest.aop.test5.CustomAnnotationMethodeInterface public void *.test1())");
	}


	/////////////////////// test execution(@CustomAnnotation public void *.test1())
	
	@Before("execution(public void *.test2())")
	public void before21() {
		System.out.println("before21 execution(public void *.test2())");
	}


	@Before("execution(public void (@com.othmen.springtest.aop.test5.CustomAnnotationClasse *).test2())")
	public void before22() {
		System.out.println("before22 execution(public void (@com.othmen.springtest.aop.test5.CustomAnnotationClasse *).test2())");
	}
	
	@Before("execution(public void (@com.othmen.springtest.aop.test5.CustomAnnotationInterface *).test2())")
	public void before23() {
		System.out.println("execution(public void (@com.othmen.springtest.aop.test5.CustomAnnotationInterface *).test2())");
	}
	
	@Before("execution(public void (@com.othmen.springtest.aop.test5.CustomAnnotationMethodeClasse *).test2())")
	public void before24() {
		System.out.println("before24 execution(public void (@com.othmen.springtest.aop.test5.CustomAnnotationMethodeClasse *).test2())");
	}
	
	@Before("execution(public void (@com.othmen.springtest.aop.test5.CustomAnnotationMethodeInterface *).test2())")
	public void before25() {
		System.out.println("before25 execution(public void (@com.othmen.springtest.aop.test5.CustomAnnotationMethodeInterface *).test2())");
	}

	
	//////////////////Tests hors sujet
	

	@After("bean(component1)")
	public void afterBean() {
		System.out.println("after bean(component1)");
	}
	
	
}
