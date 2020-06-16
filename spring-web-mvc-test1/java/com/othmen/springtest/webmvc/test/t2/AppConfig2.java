package com.othmen.springtest.webmvc.test.t2;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import com.othmen.springtest.webmvc.test.t2.tt.AppConfigTt;

@Configuration
@ComponentScan(basePackages = "com.othmen.springtest.webmvc.test.t2", 
	excludeFilters = {
			@Filter(pattern = "com\\.othmen\\.springtest\\.webmvc\\.test\\.t2\\.tt\\..*", type = FilterType.REGEX),
			@Filter(pattern = "com\\.othmen\\.springtest\\.webmvc\\.test\\.t2\\.root\\..*", type = FilterType.REGEX),
			@Filter(type = FilterType.ASSIGNABLE_TYPE, classes = AppConfigTt.class) } )
//@ImportResource("com/othmen/springtest/webmvc/test/t2/config.xml")
@ImportResource("WEB-INF/t2/config.xml")
public class AppConfig2 {

//	@Bean
//	public HandlerMapping handlerMapping() {
//		System.out.println("handlerMapping");
//		return new org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping();
//	}
	
	@Bean
	public ConversionService conversionService() {
		DefaultConversionService conversionService = new DefaultConversionService();
		conversionService.addConverter(new com.othmen.springtest.webmvc.test.t2.controller.Person.PersonTOStringConverter());
		return conversionService;
	}
	
	@PostConstruct
	public RouterFunction<ServerResponse> routerFunction() {
		System.out.println("routerFunction");
		RouterFunction<ServerResponse> ee = org.springframework.web.servlet.function.RouterFunctions.route()
				.GET("/router-function", AppConfig2::handleRouterFunction)
				.build();
		return ee;
	}
	
	public static ServerResponse handleRouterFunction(ServerRequest request) {
		ServerResponse response = ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body("body");
		return response;
    }
	
}
