package com.othmen.testspring.springcore.events.test1;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bean1 implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	private ApplicationContext ctx;
	
//	public Bean1(ApplicationContext ctx) {
//		this.ctx = ctx;
//	}
	
	public void m1() {
		Event1 e = new Event1(this, "m1");
		applicationContext.publishEvent(e);
	}
//	
//	public void m2() {
//		Event1 e = new Event1(this, "m2");
//		applicationContext.publishEvent(e);
//	}
	
//	public void m3() {
//		Event1 e = new Event1(this, "m3");
//		ctx.publishEvent(e);
//	}
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
