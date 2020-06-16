package com.othmen.springtest.webmvc.test.async;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AsynchronousWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {AsynchronousRequestsConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/async/*"};
	}
	
	public String getServletName() {
		return DEFAULT_SERVLET_NAME + "-async";
	}

}
