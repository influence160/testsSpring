package com.othmen.testspring.springcore.propertyeditor.t2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bean1 {


	@Value("aaa/bbb")
	private Person p1;
	
	@Value("ccc/ddd")
	private Animal a1;

	public Person getP1() {
		return p1;
	}


	public Animal getA1() {
		return a1;
	}

	
	
}
