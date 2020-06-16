package com.othmen.testspring.springcore.containerextensionpoint.beans;

import org.springframework.beans.factory.FactoryBean;

public class C2FactoryBean implements FactoryBean<C2>{

	public C2 getObject() throws Exception {
		return new C2();
	}

	public Class<?> getObjectType() {
		return C2.class;
	}
	

	public boolean isSingleton() {
		return false;
	}

}
