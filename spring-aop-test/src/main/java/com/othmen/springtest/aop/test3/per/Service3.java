package com.othmen.springtest.aop.test3.per;

import org.springframework.stereotype.Service;

import com.othmen.springtest.aop.test3.per.interfaces.IDAO1;

@Service
public class Service3 {
	
	private IDAO1 aaaDAO;
	private BbbDAO bbbDAO;
	
	public Service3(IDAO1 aaaDAO, BbbDAO bbbDAO) {
		this.aaaDAO = aaaDAO;
		this.bbbDAO = bbbDAO;
	}


	public void testService31() {
		System.out.println("testService31");
		aaaDAO.test1();
	}

	public void testService32() {
		System.out.println("testService32");
		bbbDAO.testBBB();
	}

	public void testService33() {
		System.out.println("testService33");
		aaaDAO.test1();
		bbbDAO.testBBB();
	}

}
