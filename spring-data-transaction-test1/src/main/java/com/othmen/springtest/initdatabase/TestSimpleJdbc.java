package com.othmen.springtest.initdatabase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.othmen.springtest.simplejdbc.test1.services.FooService;

@Configuration
@ImportResource("initdatabase/context.xml")
public class TestSimpleJdbc {

	//Run with VM Argument : -DinitDatabase=true
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestSimpleJdbc.class);
		
	}
}
