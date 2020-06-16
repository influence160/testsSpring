package com.othmen.testspring.springcore.events.test1;

import org.springframework.context.ApplicationListener;

public class EventListener implements ApplicationListener<Event1> {

	public void onApplicationEvent(Event1 event) {
		System.out.println("Event1 detecté " + event.message);
	}

}
