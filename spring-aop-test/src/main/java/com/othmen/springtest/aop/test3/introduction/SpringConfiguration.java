package com.othmen.springtest.aop.test3.introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackageClasses = SpringConfiguration.class)
@EnableAspectJAutoProxy
public class SpringConfiguration {
	
	//Test ordered
	
	public static void main(String... args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		test1(ctx);
	}

	private static void test1(AnnotationConfigApplicationContext ctx) {
		Interface2 c1 = (Interface2)ctx.getBean("component1");
		c1.test2();
		Interface2 c0 = (Interface2) ctx.getBean("component0");
		c0.test2();
		
		System.out.println(Aspect1.interface2);
	}

}
