package com.othmen.testspring.springcore.dependencies;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

import com.othmen.testspring.springcore.dependencies.beans.C2;

public class LookupMethodInjection {
	//lookup method is used to inject a prototype bean to a singleton bean
	
	public static void main(String[] args) {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("dependencies/lookupMethodTest.xml");
		context.refresh();
		C2 c2 = context.getBean(C2.class);
		c2.m1();
	}

}
