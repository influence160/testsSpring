package com.othmen.springtest.aop.test3.per;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

import com.othmen.springtest.aop.test3.per.interfaces.Service1I;

@Configuration
@ComponentScan(basePackageClasses = SpringConfiguration.class)
//@EnableAspectJAutoProxy
@ImportResource("test3/aspects-per-config.xml")
public class SpringConfiguration {
	
	//perthis
	
	public static void main(String... args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		test1(ctx);
	}

	private static void test1(AnnotationConfigApplicationContext ctx) {
		Service1I s1 = ctx.getBean(Service1I.class);
		s1.testService1();
		s1.testService12();
		s1.testService13();
	}

}
