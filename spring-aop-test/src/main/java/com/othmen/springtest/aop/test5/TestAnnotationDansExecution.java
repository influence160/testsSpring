package com.othmen.springtest.aop.test5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy()
@ComponentScan(basePackageClasses = TestAnnotationDansExecution.class)
public class TestAnnotationDansExecution {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestAnnotationDansExecution.class);
		test1(ctx);
	}

	private static void test1(AnnotationConfigApplicationContext ctx) {
		Interface1 c1 = (Interface1)ctx.getBean("component1");
		c1.test1();
		c1.test2();
	}

}
