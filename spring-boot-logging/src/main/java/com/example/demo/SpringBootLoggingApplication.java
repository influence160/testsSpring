package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.beans.A;

@SpringBootApplication
public class SpringBootLoggingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootLoggingApplication.class, args);
		A a = ctx.getBean(A.class);
		a.test();
	}

}
