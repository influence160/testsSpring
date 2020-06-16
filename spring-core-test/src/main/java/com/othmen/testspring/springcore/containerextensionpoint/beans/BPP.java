package com.othmen.testspring.springcore.containerextensionpoint.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BPP implements BeanPostProcessor, InitializingBean, DisposableBean{
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization " + beanName);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization " + beanName);
		return bean;
	}
	
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		
	}

}
