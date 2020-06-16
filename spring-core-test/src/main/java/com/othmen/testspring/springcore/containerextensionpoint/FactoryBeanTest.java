package com.othmen.testspring.springcore.containerextensionpoint;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

import com.othmen.testspring.springcore.containerextensionpoint.beans.B2;
import com.othmen.testspring.springcore.containerextensionpoint.beans.BPP;

public class FactoryBeanTest {

	public static void main(String[] args) {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("containerextensionpoint/FactoryBeanTest.xml");
		context.refresh();
		context.getBean("c21");
		context.getBean("c22");
		System.out.println("context.getBean(c1) = " + context.getBean("c1"));
		System.out.println("context.getBean(c2) = " + context.getBean("c2"));
		context.close();
	}

}
