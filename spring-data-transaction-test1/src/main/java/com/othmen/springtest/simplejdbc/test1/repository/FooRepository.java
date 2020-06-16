package com.othmen.springtest.simplejdbc.test1.repository;

import java.util.List;

import com.othmen.springtest.simplejdbc.test1.entity.Foo;

public interface FooRepository {

	List<Foo> getAll();
	
    Foo getFoo(String fooName);

    Foo getFoo(int id);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);

	void batchInsert(List<Foo> fooToInsert);
    
}
