package com.othmen.springtest.simpletests.test2.services;

import com.othmen.springtest.simpletests.test2.entity.Foo;

public interface FooService {
	
    Foo getFoo(String fooName);

    Foo getFoo(int id, String fooName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);
}
