package com.othmen.springtest.aop.test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackageClasses = SpringConfiguration.class)
@EnableAspectJAutoProxy
@ImportResource("test1/aspects-config.xml")
public class SpringConfiguration {
	
	//Aspectj AOP support

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//		test1(ctx);
//		test2(ctx);
		testWithinTarget();
//		testArgsAspect();
	}

	private static void testArgsAspect() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Interface4 i4 = (Interface4) ctx.getBean(Interface4.class);
		i4.test1("vvv");
	}

	private static void testWithinTarget() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Interface31 c3 = (Interface31) ctx.getBean(Interface31.class);
		c3.test1();
	}

	private static void test2(AnnotationConfigApplicationContext ctx) {
		LogMethodCallDurationAspect a1 = (LogMethodCallDurationAspect) ctx.getBean("logMethodCallDurationAspect");
		Component2 c2 = ctx.getBean(Component2.class);
		c2.getValue1();
		c2.getValue2(55);
		c2.printValue3();
	}

	private static void test1(AnnotationConfigApplicationContext ctx) {
		Component1 c1 = ctx.getBean(Component1.class);
		c1.getValue1();
		c1.getValue2();
		c1.printValue3();
	}
}
