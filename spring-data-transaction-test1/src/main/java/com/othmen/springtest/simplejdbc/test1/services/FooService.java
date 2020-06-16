package com.othmen.springtest.simplejdbc.test1.services;

import com.othmen.springtest.simplejdbc.test1.entity.Foo;

public interface FooService {
	
    Foo getFoo(String fooName);

    Foo getFoo(int id, String fooName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);

    public void test1();

    public void batchInsert(int n, String names);
}
