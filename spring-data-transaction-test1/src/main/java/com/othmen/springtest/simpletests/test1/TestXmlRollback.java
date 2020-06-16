package com.othmen.springtest.simpletests.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.othmen.springtest.simpletests.test1.entity.Foo;
import com.othmen.springtest.simpletests.test1.services.FooService;

public class TestXmlRollback {

	//Test Rollback
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("simpletests/test1-context.xml");
		
		FooService fooService = ctx.getBean(FooService.class);

		try {
			fooService.getFoo("aa");
		} catch (RuntimeException e) {
			System.out.println("exception fooService.getFoo");
			e.printStackTrace();
		}
		fooService.insertFoo(new Foo());
	}
}
