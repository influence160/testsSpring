package com.othmen.testspring.springcore.containerextensionpoint.beans;

import org.springframework.beans.factory.FactoryBean;

public class C1FactoryBean implements FactoryBean<C1> {

	public C1 getObject() throws Exception {
		return new C1();
	}

	public Class<?> getObjectType() {
		return C1.class;
	}

	//default boolean isSingleton() {
	//	return true;
	//}
}
