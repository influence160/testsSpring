package com.othmen.testspring.springcore.annotationbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredMultipleCondidateTest2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.othmen.testspring.springcore.annotationbased.beans2");
		ctx.refresh();
		System.out.println(ctx.getBean(com.othmen.testspring.springcore.annotationbased.beans2.A3.class).getA());
		
		//Working
		//Marche exactement pareil avec @Named a la place de @Componenet et @Inject a la place de @Autowired
	}

}
