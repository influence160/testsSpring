package com.othmen.springtest.simpletests.test2.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.othmen.springtest.simpletests.test2.entity.Foo;

@Service
@Transactional
public class DefaultFooService implements FooService {

	@Override
	@Transactional(readOnly = true)
	public Foo getFoo(String fooName) {
		throw new RuntimeException("not implemented");
//		return null;
	}

	@Override
	@Transactional(readOnly = true)
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
