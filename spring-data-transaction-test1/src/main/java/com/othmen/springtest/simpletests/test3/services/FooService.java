package com.othmen.springtest.simpletests.test3.services;

import com.othmen.springtest.simpletests.test3.entity.Foo;

public interface FooService {
	
    Foo getFoo(String fooName);

    Foo getFoo(int id, String fooName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);
}
