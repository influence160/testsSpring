package com.othmen.testspring.springcore.beanoverview;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class TestFactoryMethodBeanInstanciation {

	public static void main(String[] args) {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("beanoverview/FactoryMethodTest.xml");
		context.refresh();
		System.out.println(context.containsBean("a1"));
		System.out.println(context.containsBean("a12"));
		System.out.println(context.containsBean("a2"));
		
	}

}
