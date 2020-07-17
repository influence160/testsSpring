package com.othmen.testspring.springcore.beanoverview.testbeans;

import org.springframework.beans.factory.BeanNameAware;

public class A1 implements BeanNameAware{

	public A1() {
		System.out.println("new A1();");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("A1 bean name is : " + name);
	}
}
