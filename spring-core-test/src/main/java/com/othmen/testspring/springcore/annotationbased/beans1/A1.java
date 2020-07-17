package com.othmen.testspring.springcore.annotationbased.beans1;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class A1 implements A, BeanNameAware{

	@Override
	public void setBeanName(String name) {
		System.out.println("A1 bean name is : " + name);
		
	}

}
