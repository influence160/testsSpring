package com.othmen.testspring.springcore.events.test1;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class XmlEventPublishingTest {

	public static void main(String[] args) {
		GenericApplicationContext ctx = new GenericApplicationContext();
		new XmlBeanDefinitionReader(ctx).loadBeanDefinitions("event/XmlEventPublishingTest.xml");
		ctx.refresh();
		
		Bean1 b1 = ctx.getBean(Bean1.class);
		b1.m1();
//		b1.m3();
		
		ctx.close();
	}

}
