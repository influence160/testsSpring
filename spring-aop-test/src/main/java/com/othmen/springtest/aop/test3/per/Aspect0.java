package com.othmen.springtest.aop.test3.per;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspect0 {
	
	@Pointcut("execution(* com.othmen.springtest.aop.test3.per.*..test*()) && @target(org.springframework.stereotype.Repository)")
	public void pontcut1() {
		
	}

}
