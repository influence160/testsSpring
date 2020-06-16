package com.othmen.testspring.springcore.containerextensionpoint;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

import com.othmen.testspring.springcore.containerextensionpoint.beans.B2;
import com.othmen.testspring.springcore.containerextensionpoint.beans.BPP;

public class BeanFactoryPostProcessorTest {

	public static void main(String[] args) {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("containerextensionpoint/BeanFactoryPostProcessorTest.xml");
		context.refresh();
		Object b2 = context.getBean("object");
		System.out.println(b2 instanceof B2);
		context.close();
	}

}
