package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApllicationRunner implements ApplicationRunner{
	
	static Log logger = LogFactory.getLog(MyApllicationRunner.class);
	
	@Autowired
	FooController fooController;
	
	@Autowired
	FooRepository fooRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("MyApllicationRunner -- fooController is " + fooController);
		logger.info("MyApllicationRunner -- fooRepository is " + fooRepository);
	}

}
