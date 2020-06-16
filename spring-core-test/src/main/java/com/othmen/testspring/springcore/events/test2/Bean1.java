package com.othmen.testspring.springcore.events.test2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Bean1 implements ApplicationEventPublisherAware, ApplicationContextAware {

	private ApplicationContext applicationContext;
	private ApplicationContext ctx;
	private ApplicationEventPublisher applicationEventPublisher;
	private ApplicationEventPublisher aep;
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	@Autowired
	ApplicationContext context;
	
	public Bean1(ApplicationContext ctx, ApplicationEventPublisher aep) {
		this.ctx = ctx;
		this.aep = aep;
	}
	
	public void n1() {
		Event1 e = new Event1(this, "n1");
		applicationEventPublisher.publishEvent(e);
	}
	
	public void n2() {
		Event1 e = new Event1(this, "n2");
		context.publishEvent(e);
	}
	
	public void n3() {
		Event1 e = new Event1(this, "n3");
		ctx.publishEvent(e);
	}
	
	public void m1() {
		Event1 e = new Event1(this, "m1");
		applicationContext.publishEvent(e);
	}
	
	public void m2() {
		Event1 e = new Event1(this, "m2");
		context.publishEvent(e);
	}
	
	public void m3() {
		Event1 e = new Event1(this, "m3");
		ctx.publishEvent(e);
	}
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;		
	}

}
