package com.othmen.testspring.springcore.events.test2;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationEventListener {


	
	@EventListener
	public void l1(Event1 e1) {
		System.out.println("Event1 detecté en utilisant @EventListener " + e1.message);
		
	}
}
