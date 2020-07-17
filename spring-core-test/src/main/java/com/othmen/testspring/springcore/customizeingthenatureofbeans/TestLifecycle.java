package com.othmen.testspring.springcore.customizeingthenatureofbeans;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

import com.othmen.testspring.springcore.customizeingthenatureofbeans.bean.L1;

public class TestLifecycle {

	public static void main(String[] args) {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("customizeingthenatureofbeans/testLifecycle.xml");

		context.refresh();
		context.start();
		L1 c2 = context.getBean(L1.class);
		System.out.println(c2.isRunning());
		context.stop();

		c2 = context.getBean(L1.class);
		System.out.println(c2.isRunning());

		context.start();
		c2 = context.getBean(L1.class);
		System.out.println(c2.isRunning());
		
	}

}
