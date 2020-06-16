package com.othmen.springtest.simplejdbc.test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.othmen.springtest.simplejdbc.test1.services.FooService;

@Configuration
@ComponentScan(basePackageClasses = TestSimpleJdbc.class)
@ImportResource("simplejdbc/test1-context.xml")
public class TestSimpleJdbc {

	//Test Rollback
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestSimpleJdbc.class);
		
		FooService fooService = ctx.getBean(FooService.class);

//		try {
//			fooService.getFoo("aa");
//		} catch (RuntimeException e) {
//			System.out.println("exception fooService.getFoo");
//			e.printStackTrace();
//		}
//		fooService.test1();
		fooService.batchInsert(6, "mlk");
	}
}
