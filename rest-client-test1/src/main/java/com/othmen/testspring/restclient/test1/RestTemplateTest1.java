package com.othmen.testspring.restclient.test1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateTest1 {

	public static void main(String[] args) {
		test3();
	}

	private static void test1() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8080/spring-enable-web-mvc-test2/rs1/p1.xml";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl, String.class);
		System.out.println(response.getBody());
	}


	private static void test2() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8080/spring-enable-web-mvc-test2/rs1/p2/88";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl, String.class);
		System.out.println(response.getBody());
	}


	private static void test3() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8080/spring-enable-web-mvc-test2/rs1/p3/88;dd=5;kk=zz;ff=19";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl, String.class);
		System.out.println(response.getBody());
	}

}
