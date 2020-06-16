package com.othmen.springtest.simpletests.test1.services;

import org.springframework.stereotype.Component;

import com.othmen.springtest.simpletests.test1.entity.Foo;

@Component
public class DefaultFooService implements FooService {

	@Override
	public Foo getFoo(String fooName) {
		throw new RuntimeException("not implemented");
//		return null;
	}

	@Override
	public Foo getFoo(String fooName, String barName) {
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
