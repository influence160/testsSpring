package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.data.Foo;
import com.example.demo.data.FooRepository;

@SpringBootApplication
public class SpringDataJpaTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaTestApplication.class, args);
		
		FooRepository fooRepository = ctx.getBean(FooRepository.class);
		Iterable<Foo> iterable = fooRepository.findAll();
		System.out.println(iterable.toString());
		System.out.println(fooRepository.getThning("bbb"));
		System.out.println(fooRepository.findAaa());

		System.out.println(fooRepository.findByIdBetween(1, 2));
		
//		System.out.println(fooRepository.findFirstIdMax());
//		System.out.println(fooRepository.findFirstByIdMax());
//		System.out.println(fooRepository.findMaxId());

		System.out.println(fooRepository.findAllById(1));
//		System.out.println(fooRepository.getById(1));
		System.out.println(fooRepository.getAllById(1));
		System.out.println(fooRepository.getById(1));
	}

}
