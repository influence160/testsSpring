package com.othmen.testspring.springcore.propertyeditor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.othmen.testspring.springcore.propertyeditor.t1.Bean1;
import com.othmen.testspring.springcore.propertyeditor.t1.CustomEditorConfiguration;


public class CustomPropertyEditorTest1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CustomEditorConfiguration.class);
		Bean1 b1 = ctx.getBean(Bean1.class);
		System.out.println(b1.getA1());
		System.out.println(b1.getP1());
	}

}
