package com.othmen.springtest.aop.test1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
public class LogMethodCallDurationAspect {


	@Around("execution(* com.othmen.springtest.aop.test1..*(int,..)) && args(i,..)")
	public void logMethodCallDuration(ProceedingJoinPoint proceedingJoinPoint, int i) throws Throwable {
		long before = System.currentTimeMillis();
		proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
		System.out.println("Methode " + proceedingJoinPoint.getSignature().toString() + " with argument i = " + i + " duration is : "  + (System.currentTimeMillis() - before));
		
	}
}
