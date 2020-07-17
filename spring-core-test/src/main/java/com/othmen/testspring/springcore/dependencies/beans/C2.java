package com.othmen.testspring.springcore.dependencies.beans;

public class C2 {
	
	public void m1() {
		C1 c1 = m2();
		System.out.println(c1);
		System.out.println("end m1");
	}

	//Can also bean abstract and abstract class
	//can also be @Lookup
	public C1 m2() {
		return null;
	}
	
	public void setCcc() {
		
	}

}
