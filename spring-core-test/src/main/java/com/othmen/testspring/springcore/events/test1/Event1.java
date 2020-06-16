package com.othmen.testspring.springcore.events.test1;

import org.springframework.context.ApplicationEvent;

public class Event1 extends ApplicationEvent {

	String message;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Event1(Object source) {
		super(source);
	}
	
	public Event1(Object source, String message) {
		this(source);
		this.message = message;
	}

}
