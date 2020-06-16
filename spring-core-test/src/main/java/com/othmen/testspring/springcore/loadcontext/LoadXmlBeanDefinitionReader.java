package com.othmen.testspring.springcore.loadcontext;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class LoadXmlBeanDefinitionReader {

	public static void main(String[] args) {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("loadcontext/LoadXmlApplicationContext.xml");
		context.refresh();
		System.out.println(context.containsBean("a"));
	}

}
