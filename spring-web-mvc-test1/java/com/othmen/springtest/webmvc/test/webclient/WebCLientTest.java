package com.othmen.springtest.webmvc.test.webclient;

//import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.DefaultUriBuilderFactory.EncodingMode;

public class WebCLientTest {

	public static void main(String[] args) {
		String baseUrl = "http://localhost:8080/spring-web-mvc-test1/tt/tt";
		DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory(baseUrl);
		factory.setEncodingMode(EncodingMode.TEMPLATE_AND_VALUES);
		
//		WebClient client = WebClient.builder().uriBuilderFactory(factory).build();
//		client.get();
	}

}
