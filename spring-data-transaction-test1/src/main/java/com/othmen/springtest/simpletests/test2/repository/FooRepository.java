package com.othmen.springtest.simpletests.test2.repository;

import com.othmen.springtest.simpletests.test2.entity.Foo;

public interface FooRepository {

	
    Foo getFoo(String fooName);

    Foo getFoo(int id);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);
    
}
