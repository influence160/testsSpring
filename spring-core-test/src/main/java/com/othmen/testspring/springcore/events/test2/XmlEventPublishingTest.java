package com.othmen.testspring.springcore.events.test2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class XmlEventPublishingTest {

	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext("com.othmen.testspring.springcore.events.test2");

		
		Bean1 b1 = ctx.getBean(Bean1.class);
		b1.n1();
		b1.n2();
		b1.n3();
		b1.m1();
		b1.m2();
		b1.m3();
		
		ctx.close();
	}

}
