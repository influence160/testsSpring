package com.othmen.testspring.springcore.customizeingthenatureofbeans.bean;

import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

@Component
public class L1 implements Lifecycle{

	private boolean running = false;

	public void start() {
		System.out.println("L1.start()");
		running = true;
		
	}

	public void stop() {
		System.out.println("L1.stop()");
		running = false;
		
	}

	public boolean isRunning() {
		return running;
	}

}
