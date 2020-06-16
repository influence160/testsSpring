package com.othmen.springtest.simpletests.test1.services;

import com.othmen.springtest.simpletests.test1.entity.Foo;

public interface FooService {
	
    Foo getFoo(String fooName);

    Foo getFoo(String fooName, String barName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);
}
