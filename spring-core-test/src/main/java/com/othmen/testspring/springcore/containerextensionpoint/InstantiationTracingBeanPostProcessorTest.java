package com.othmen.testspring.springcore.containerextensionpoint;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class InstantiationTracingBeanPostProcessorTest  {

	public static void main(String[] args) {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("containerextensionpoint/InstantiationTracingBeanPostProcessorTest.xml");
		context.refresh();
	}

}
