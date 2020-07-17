package com.othmen.testspring.springcore.propertyeditor.t2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;

import com.othmen.testspring.springcore.propertyeditor.t1.Person;

@Configuration
@ComponentScan(basePackageClasses = CustomConverterConfiguration.class)
public class CustomConverterConfiguration {

	@Bean
	public ConversionService conversionService() {
		DefaultConversionService  conversionService = new DefaultConversionService ();
        conversionService.addConverter(getCustomConverter());
        conversionService.addConverter(getCustomConverterAnimal());
        return conversionService;
	}

	@Bean
	public Converter<String, Animal> getCustomConverterAnimal() {
		return new Converter<String, Animal> () {

			@Override
			public Animal convert(String source) {
		        String[] t = source.split("/");
		        if (t.length != 2) {
		        	throw new java.lang.IllegalArgumentException(source);
		        }
		        Animal a = new Animal();
		        a.setType(t[0]);
		        a.setName(t[1]);
		        return a;
			}
			
		};
	}

	@Bean
	public Converter<String, Person> getCustomConverter() {
		return new Converter<String, Person> () {

			@Override
			public Person convert(String source) {
		        String[] t = source.split("/");
		        if (t.length != 2) {
		        	throw new java.lang.IllegalArgumentException(source);
		        }
		        Person p = new Person();
		        p.setNom(t[0]);
		        p.setPrenom(t[1]);
		        return p;
			}
			
		};
	}
}
