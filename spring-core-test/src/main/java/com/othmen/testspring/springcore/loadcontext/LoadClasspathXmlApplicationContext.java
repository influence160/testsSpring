package com.othmen.testspring.springcore.loadcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoadClasspathXmlApplicationContext {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("loadcontext/LoadXmlApplicationContext.xml");
		System.out.println(context.containsBean("a"));
	}

}
