package com.othmen.testspring.springcore.containerextensionpoint.beans;

public class C12 {
	private C1 c1;
	public C12(C1 c1) {
		System.out.println("new C12 with C1 = " + c1);
		this.c1 = c1;
	}

}
