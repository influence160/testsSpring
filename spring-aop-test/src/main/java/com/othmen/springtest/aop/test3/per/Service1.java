package com.othmen.springtest.aop.test3.per;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.othmen.springtest.aop.test3.per.interfaces.IDAO1;
import com.othmen.springtest.aop.test3.per.interfaces.Service1I;

@Service
public class Service1 implements Service1I {
	
	private IDAO1 aaaDAO;
	private BbbDAO bbbDAO;
	
	public Service1(IDAO1 aaaDAO) {
		this.aaaDAO = aaaDAO;
	}
	
	@Autowired
	public Service1(IDAO1 aaaDAO, BbbDAO bbbDAO) {
		this.aaaDAO = aaaDAO;
		this.bbbDAO = bbbDAO;
	}
	

	@Override
	public void testService1() {
		System.out.println("testService1");
		aaaDAO.test1();
	}

	public void testService12() {
		System.out.println("testService12");
		bbbDAO.testBBB();
	}

	public void testService13() {
		System.out.println("testService13");
		aaaDAO.test1();
		bbbDAO.testBBB();
	}
}
