package com.othmen.springtest.webmvc.test.async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan(basePackageClasses = AsynchronousRequestsConfig.class)
public class AsynchronousRequestsConfig {
	
	@Bean
	public AsyncTaskExecutor asyncTaskExecutor () {
		return new ThreadPoolTaskExecutor();
	}

}
