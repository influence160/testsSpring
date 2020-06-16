package com.othmen.springtest.aop.test3.per;

import org.springframework.stereotype.Repository;

import com.othmen.springtest.aop.test3.per.interfaces.IDAO1;

@Repository
public class AaaDAO implements IDAO1 {

	@Override
	public void test1() {
		System.out.println("aaa test1");
	}
	
	
}
