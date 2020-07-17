package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("security-context.xml")
public class SpringSecurityTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityTest1Application.class, args);
	}

}
