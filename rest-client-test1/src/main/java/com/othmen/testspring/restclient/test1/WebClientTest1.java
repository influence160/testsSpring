package com.othmen.testspring.restclient.test1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;

public class WebClientTest1 {
	static DefaultUriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory("http://localhost:8080/spring-enable-web-mvc-test2");

	public static void main(String[] args) {
		test3();
	}

	private static void test1() {
		WebClient webClient = WebClient.builder().uriBuilderFactory(uriBuilderFactory).build();
		
		webClient.get().uri(uriBuilderFactory.builder().path("/rs1/p1.xml").build());
//		String fooResourceUrl
//		  = ;
//		ResponseEntity<String> response
//		  = restTemplate.getForEntity(fooResourceUrl, String.class);
//		System.out.println(response.getBody());
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
