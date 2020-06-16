package com.othmen.testspring.restclient.test1;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.env.MockEnvironment;
import org.springframework.web.client.RestTemplate;

import org.junit.Assert;

public class RestTemplateTest2 {
	
	public RestTemplateTest2() {
		MockEnvironment environment = new MockEnvironment();
		
	}
	
	@Test
	public void test1() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8080/spring-enable-web-mvc-test2/rs1/test";
		String response
		  = restTemplate.getForObject(fooResourceUrl, String.class);
		Assert.assertEquals("test", response);
	}

}
