package com.othmen.testspring.springcore.annotationbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.othmen.testspring.springcore.annotationbased.beans1.A3;

public class AutowiredMultipleCondidateTest1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.othmen.testspring.springcore.annotationbased.beans1");
//		ctx.scan("com.othmen.testspring.springcore.annotationbased.beans1");
		System.out.println(ctx.getBean(A3.class).getA());
		
		//NoUniqueBeanDefinitionException
	}

}
