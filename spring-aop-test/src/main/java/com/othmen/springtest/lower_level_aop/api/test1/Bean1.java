package com.othmen.springtest.lower_level_aop.api.test1;

public class Bean1 implements TestInterface {
	
	public void test1() {
		System.out.println("test1");
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}

	@Override
	public void hhhh() {
		System.out.println("hhhh");		
	}

}
