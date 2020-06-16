package com.othmen.springtest.lower_level_aop.api.test1;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericApplicationContext ctx = new GenericApplicationContext();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(ctx);
		reader.loadBeanDefinitions("/lower_level_aop/*/aspects-config.xml");
		ctx.refresh();

		test1(ctx);
		
		
		test2(ctx);
		
		test3(ctx);
		
	}

	private static void test1(GenericApplicationContext ctx) {
		System.out.println("----------------------TEST1-------------------------");
		TestInterface bean1 = (TestInterface) ctx.getBean("bean1");
		bean1.test1();
		bean1.test2();
		bean1.hhhh();
	}

	private static void test2(GenericApplicationContext ctx) {
		System.out.println("----------------------TEST2-------------------------");
		Bean1 bean2 = (Bean1) ctx.getBean("bean2");
		bean2.test1();
		bean2.test2();
		bean2.hhhh();
	}
	
	private static void test3(GenericApplicationContext ctx) {
		System.out.println("----------------------TEST3-------------------------");
		Bean3 bean3 = (Bean3) ctx.getBean("bean3");
		bean3.testAaa();
		bean3.testBbb();
		bean3.ccc();
	}
}
