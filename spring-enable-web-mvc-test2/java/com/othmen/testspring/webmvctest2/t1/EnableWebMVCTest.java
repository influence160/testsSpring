package com.othmen.testspring.webmvctest2.t1;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;


@Configuration
@ComponentScan(basePackageClasses = EnableWebMVCTest.class)
@EnableWebMvc
public class EnableWebMVCTest implements WebMvcConfigurer {
    
	public void configurePathMatch(PathMatchConfigurer configurer) {
		UrlPathHelper urlPathHelper = new UrlPathHelper();
		urlPathHelper.setRemoveSemicolonContent(false);
		configurer.setUrlPathHelper(urlPathHelper);
	}
	
//	@Override
//    public void addFormatters(FormatterRegistry registry) {
//		registry.addConverter(new Person.PersonTOStringConverter());
//    }
//	
//	
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//    	System.out.println(converters);
//    }
}