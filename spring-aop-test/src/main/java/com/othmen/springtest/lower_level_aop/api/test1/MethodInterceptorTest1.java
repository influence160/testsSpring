package com.othmen.springtest.lower_level_aop.api.test1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MethodInterceptorTest1 implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("MethodInterceptorTest1 " + invocation.toString());
		Object obj = invocation.proceed();
		System.out.println("end MethodInterceptorTest1 " + invocation.toString());
		return obj;
	}

}
