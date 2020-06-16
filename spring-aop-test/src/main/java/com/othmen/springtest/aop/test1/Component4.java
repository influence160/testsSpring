package com.othmen.springtest.aop.test1;

import org.springframework.stereotype.Component;

@Component
public class Component4 implements Interface4 {

	@Override
	@TestAnnotation(caca = "kk", value = 5)
	public void test1(String vv) {
		System.out.println("Component4.test1(" + vv + ")");
	}

	
}
