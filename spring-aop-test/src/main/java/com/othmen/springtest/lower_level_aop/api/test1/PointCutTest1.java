package com.othmen.springtest.lower_level_aop.api.test1;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

public class PointCutTest1 implements MethodMatcher, Pointcut, ClassFilter  {

	@Override
	public boolean matches(Class<?> clazz) {
		return clazz.getPackage().equals(Package.getPackage("com.othmen.springtest.lower_level_aop.api.test1"));
	}

	@Override
	public ClassFilter getClassFilter() {
		return this;
	}

	@Override
	public MethodMatcher getMethodMatcher() {
		return this;
	}

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return method.getName().startsWith("test");
	}

	@Override
	public boolean isRuntime() {
		return false;
	}

	@Override
	public boolean matches(Method method, Class<?> targetClass, Object... args) {
		return matches(method, targetClass);
	}
	
}
