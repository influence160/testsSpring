package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.beans.A;
import com.example.demo.beans.MyObject;

@SpringBootApplication()
@EnableConfigurationProperties(MyObject.class)
public class SpringBootConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootConfigurationPropertiesApplication.class, args);
		
		A a = ctx.getBean(A.class);
		a.printMyObject();
	}

}
