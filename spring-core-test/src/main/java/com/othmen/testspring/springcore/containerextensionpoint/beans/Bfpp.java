package com.othmen.testspring.springcore.containerextensionpoint.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class Bfpp implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		beanFactory.getBeanDefinition("object").setBeanClassName("com.othmen.testspring.springcore.containerextensionpoint.beans.B2");
	}

}
