package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@SpringBootApplication
public class SpringBootWeb1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWeb1Application.class, args);
	}

	@Bean
	public UrlBasedViewResolver urlBasedViewResolver() {
		return new InternalResourceViewResolver("", ".jsp");
	}
}
