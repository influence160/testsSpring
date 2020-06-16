package com.othmen.springtest.webmvc.test.enablewebmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.othmen.springtest.webmvc.test.t2.controller.Person.PersonTOStringConverter;

@Configuration
@ComponentScan(basePackageClasses = EnableWebMVCTest.class)
@EnableWebMvc
public class EnableWebMVCTest implements WebMvcConfigurer {
    
	@Override
    public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new PersonTOStringConverter());
    }
	
}
