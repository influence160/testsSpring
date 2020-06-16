package com.othmen.springtest.simpletests.test3.services;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.othmen.springtest.simpletests.test3.entity.Foo;

@Service
//@javax.transaction.Transactional
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
public class DefaultFooService implements FooService {

	@Override
	@Transactional
//	@Transactional(readOnly = true)
	public Foo getFoo(String fooName) {
		throw new RuntimeException("not implemented");
//		return null;
	}

	@Override
	@Transactional
//	@Transactional(readOnly = true)
	public Foo getFoo(int fooId, String fooName) {
		throw new RuntimeException("not implemented");
//		return null;
	}

	@Override
	public void insertFoo(Foo foo) {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void updateFoo(Foo foo) {
		throw new RuntimeException("not implemented");
	}

}
