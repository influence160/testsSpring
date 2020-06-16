package com.othmen.springtest.simpletests.test2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.othmen.springtest.simpletests.test2.entity.Foo;
import com.othmen.springtest.simpletests.test2.services.FooService;

@Configuration
@ComponentScan(basePackageClasses = TestAnnotationAndXml.class)
@ImportResource("simpletests/test2-context.xml")
public class TestAnnotationAndXml {

	//Test Rollback
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestAnnotationAndXml.class);
		
		FooService fooService = ctx.getBean(FooService.class);

		try {
			fooService.getFoo("aa");
		} catch (RuntimeException e) {
			System.out.println("exception fooService.getFoo");
			e.printStackTrace();
		}
		fooService.insertFoo(new Foo(0, null));
	}
}
