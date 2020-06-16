package com.othmen.springtest.webmvc.test.t2;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.othmen.springtest.webmvc.test.t2.root.RootConfig;

public class MyWebApplicationInitializer2 extends AbstractAnnotationConfigDispatcherServletInitializer {

	
	public MyWebApplicationInitializer2() {
		System.out.println("MyWebApplicationInitializer2");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?> [] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?> [] {AppConfig2.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/t2/*"};
	}

}
