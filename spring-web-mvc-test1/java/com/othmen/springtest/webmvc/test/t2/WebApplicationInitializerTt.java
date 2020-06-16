package com.othmen.springtest.webmvc.test.t2;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.othmen.springtest.webmvc.test.t2.tt.AppConfigTt;

public class WebApplicationInitializerTt extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	public WebApplicationInitializerTt() {
		System.out.println("WebApplicationInitializerTt");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?> [] {AppConfigTt.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/tt/*"};
	}
	
	protected String getServletName() {
		return DEFAULT_SERVLET_NAME + "-tt";
	}
}