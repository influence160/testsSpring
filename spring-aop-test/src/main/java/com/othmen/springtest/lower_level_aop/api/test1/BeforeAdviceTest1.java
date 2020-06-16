package com.othmen.springtest.lower_level_aop.api.test1;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdviceTest1 implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("BeforeAdviceTest1 " + method.toString() + " target : " + target);
	}

}
