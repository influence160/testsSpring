package com.othmen.testspring.springcore.customizeingthenatureofbeans.bean;

import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

@Component
public class L1 implements Lifecycle{

	public void start() {
		System.out.println("L1.start()");
		
	}

	public void stop() {
		System.out.println("L1.stop()");
		
	}

	public boolean isRunning() {
		// TODO Auto-generated method stub
		return false;
	}

}
