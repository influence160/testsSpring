package com.othmen.springtest.simplejdbc.test1.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class Service2CGLIB {
	
	public void appel1() {
		System.out.println("debut appel 1");
		appel2();
		System.out.println("fin appel 1");
	}

	public void appel2() {
		System.out.println("debut appel 2");
		System.out.println("fin appel 2");
	}

}
