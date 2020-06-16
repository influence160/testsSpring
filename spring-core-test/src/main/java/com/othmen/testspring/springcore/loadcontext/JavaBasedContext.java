package com.othmen.testspring.springcore.loadcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.othmen.testspring.springcore.loadcontext.beans.TestBean;

@Configuration
public class JavaBasedContext {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedContext.class);
		System.out.println(context.getBeanNamesForType(TestBean.class)[0]);
		System.out.println(context.getBeanNamesForType(JavaBasedContext.class)[0]);
	}
	
	@Bean()
	public static TestBean testBean() {
		return new TestBean();
	}

}
