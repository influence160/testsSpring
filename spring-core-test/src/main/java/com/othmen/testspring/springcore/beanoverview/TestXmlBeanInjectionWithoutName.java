package com.othmen.testspring.springcore.beanoverview;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

import com.othmen.testspring.springcore.beanoverview.testbeans.A1;

public class TestXmlBeanInjectionWithoutName {

	public static void main(String[] args) {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("beanoverview/TestXmlBeanInjectionWithoutName.xml");
		context.refresh();
	
		System.out.println(context.containsBean("a2"));
		
	}

}
