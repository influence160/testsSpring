package com.othmen.springtest.aop.test5;

import org.springframework.stereotype.Component;

@Component(value = "component1")
@CustomAnnotationClasse
public class Component1 implements Interface1 {

	@Override
	@CustomAnnotationMethodeClasse
	public void test1() {
		System.out.println("Component1.test1()");
	}

	@Override
	@CustomAnnotationMethodeClasse
	public void test2() {
		System.out.println("Component1.test2()");
	}


}
