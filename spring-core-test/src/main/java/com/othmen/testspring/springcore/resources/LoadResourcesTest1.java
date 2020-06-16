package com.othmen.testspring.springcore.resources;

import java.io.IOException;
import java.nio.file.Files;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.othmen.testspring.springcore.resources.p1.p2.*;

public class LoadResourcesTest1 {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("LoadResourcesTest1.xml", Bean1.class);
		Bean1 bean1 = context.getBean(Bean1.class);

		System.out.println(bean1.getResource1().exists());
		System.out.println(bean1.getResource2().exists());
		System.out.println(bean1.getResource3().exists());

		System.out.println(Files.readAllLines(bean1.getResource1().getFile().toPath()).get(0));
//		System.out.println(Files.readAllLines(bean1.getResource2().getFile().toPath()).get(0));
	}

}
