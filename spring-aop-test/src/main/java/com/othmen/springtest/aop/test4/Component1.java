package com.othmen.springtest.aop.test4;

import java.lang.annotation.Annotation;

import org.springframework.stereotype.Component;

@Component
public class Component1 implements Interface1 {

	@Override
	public void test1() {
		System.out.println("Component1.test1()");
	}

	@Override
	public Interface1 test2() {
		System.out.println("Component1.test2()");
		return this;
	}

	@Override
	public CustomAnnotation test3() {
		System.out.println("Component1.test3()");
		return new CustomAnnotation() {
			
			@Override
			public Class<? extends Annotation> annotationType() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
