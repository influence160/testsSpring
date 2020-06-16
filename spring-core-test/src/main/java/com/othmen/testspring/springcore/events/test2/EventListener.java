package com.othmen.testspring.springcore.events.test2;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener implements ApplicationListener<Event1> {

	public void onApplicationEvent(Event1 event) {
		System.out.println("Event1 detecté " + event.message);
	}

}
