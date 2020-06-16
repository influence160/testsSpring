package com.othmen.testspring.springcore.containerextensionpoint;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

import com.othmen.testspring.springcore.containerextensionpoint.beans.BPP;
import com.othmen.testspring.springcore.dependencies.beans.C2;

public class BeanPostProcessorTest {

	public static void main(String[] args) {		
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("containerextensionpoint/BeanPostProcessorTest.xml");
		context.refresh();
		BPP bpp = context.getBean("bpp", BPP.class);

		context.close();
	}

}
