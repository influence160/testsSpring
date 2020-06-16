package com.othmen.springtest.aop.test2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackageClasses = SpringConfiguration.class)
@ImportResource("test2/aspects-config.xml")
public class SpringConfiguration {
	
	//Test ordered
	
	public static void main(String... args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		test1(ctx);
	}

	private static void test1(AnnotationConfigApplicationContext ctx) {
		Interface1 c1 = (Interface1)ctx.getBean("component1");
		c1.test1();
	}

}
