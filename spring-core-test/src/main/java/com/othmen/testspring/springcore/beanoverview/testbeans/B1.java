package com.othmen.testspring.springcore.beanoverview.testbeans;

public class B1 {
	
	public static A1 getA1() {
		return new A1();
	}
	
	public A1 getA12() {
		return new A1();
	}
	
	public A2 getA2(A1 a1) {
		return new A2(a1);
	}

}
