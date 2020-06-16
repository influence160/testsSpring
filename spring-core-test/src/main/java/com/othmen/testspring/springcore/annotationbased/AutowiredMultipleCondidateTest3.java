package com.othmen.testspring.springcore.annotationbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredMultipleCondidateTest3 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.othmen.testspring.springcore.annotationbased.beans3");
		ctx.refresh();
		System.out.println(ctx.getBean(com.othmen.testspring.springcore.annotationbased.beans3.A3.class).getA());
		
		System.out.println(ctx.getBean(com.othmen.testspring.springcore.annotationbased.beans3.A3.class).getA4());
		//Working
	}

}
