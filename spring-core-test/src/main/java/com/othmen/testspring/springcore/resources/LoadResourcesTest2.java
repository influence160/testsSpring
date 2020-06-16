package com.othmen.testspring.springcore.resources;

import java.io.IOException;
import java.nio.file.Files;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.othmen.testspring.springcore.resources.p1.p2.Bean2;

@Configuration()
@ComponentScan(includeFilters = @Filter(type = FilterType.REGEX, pattern = "com.othmen.testspring.springcore.resources.p1.p2.*2"))
public class LoadResourcesTest2 {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(LoadResourcesTest2.class);

		Bean2 b2 = ctx.getBean(Bean2.class);
		

		System.out.println(b2.getResource1().exists());
		System.out.println(b2.getResource2().exists());
		System.out.println(b2.getResource3().exists());

		System.out.println(Files.readAllLines(b2.getResource1().getFile().toPath()).get(0));
//		System.out.println(Files.readAllLines(b2.getResource2().getFile().toPath()).get(0));

	}

}
