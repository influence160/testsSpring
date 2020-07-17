package com.othmen.springtest.simplejdbc.test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.othmen.springtest.simplejdbc.test1.services.FooService;
import com.othmen.springtest.simplejdbc.test1.services.Service2CGLIB;

@Configuration
@ComponentScan(basePackageClasses = TestSimpleJdbc.class)
@ImportResource("simplejdbc/test1-context.xml")
public class TestSimpleJdbc {

	//Test Rollback
	public static void main(String[] args) {
//		test1();
		test2TestAppelInterneCGLIB();
	}

	private static void test1() {
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
	
	public static void test2TestAppelInterneCGLIB() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestSimpleJdbc.class);
		
		Service2CGLIB service2CGLIB = ctx.getBean(Service2CGLIB.class);

//		try {
//			fooService.getFoo("aa");
//		} catch (RuntimeException e) {
//			System.out.println("exception fooService.getFoo");
//			e.printStackTrace();
//		}
//		fooService.test1();
		service2CGLIB.appel1();
	}
}
