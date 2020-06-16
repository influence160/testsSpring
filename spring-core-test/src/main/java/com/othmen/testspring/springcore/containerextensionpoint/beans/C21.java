package com.othmen.testspring.springcore.containerextensionpoint.beans;

public class C21 {
	private C2 c2;
	public C21(C2 c2) {
		System.out.println("new C21 with C2 = " + c2);
		this.c2 = c2;
	}

}
