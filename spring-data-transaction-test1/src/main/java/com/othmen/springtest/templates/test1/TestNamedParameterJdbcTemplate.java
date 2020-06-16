package com.othmen.springtest.templates.test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.othmen.springtest.templates.test1.services.FooService;

@Configuration
@ComponentScan(basePackageClasses = TestNamedParameterJdbcTemplate.class)
@ImportResource("templates/test2-context.xml")
public class TestNamedParameterJdbcTemplate {

	//Test Rollback
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestNamedParameterJdbcTemplate.class);
		
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
