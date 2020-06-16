package com.othmen.testspring.springcore.containerextensionpoint.beans;

public class C11 {
	
	private C1 c1;
	public C11(C1 c1) {
		System.out.println("new C11 with C1 = " + c1);
		this.c1 = c1;
	}

}
