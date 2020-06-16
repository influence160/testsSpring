package com.othmen.testspring.springcore.classpathscanningandmanagedcomponent;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.othmen.testspring.springcore.classpathscanningandmanagedcomponent.beans1.A;
import com.othmen.testspring.springcore.classpathscanningandmanagedcomponent.beans1.A2;
import com.othmen.testspring.springcore.classpathscanningandmanagedcomponent.beans1.A3;

@Configuration()
@ComponentScan(basePackages = {"com.othmen.testspring.springcore.classpathscanningandmanagedcomponent.beans1"})
public class InjectionPointTest1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(InjectionPointTest1.class);
		ctx.refresh();
		System.out.println(ctx.getBean(A3.class).getA());
		
		//NoUniqueBeanDefinitionException
	}

//	@Bean
//	public A3 b(@Autowired A a) {
//		return new A3(a);
//	}
	
	@Bean
	public A a(InjectionPoint injectionPoint) {
		System.out.println(injectionPoint.getMember());
		return new A2();
	}
	

}
