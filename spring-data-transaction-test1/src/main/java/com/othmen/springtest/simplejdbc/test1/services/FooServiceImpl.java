package com.othmen.springtest.simplejdbc.test1.services;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.othmen.springtest.simplejdbc.test1.entity.Foo;
import com.othmen.springtest.simplejdbc.test1.repository.FooRepository;

@Service
@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRES_NEW)
public class FooServiceImpl implements FooService {
	
	private FooRepository fooRepository;
	
	public FooServiceImpl(FooRepository fooRepository) {
		this.fooRepository = fooRepository;
	}

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
	
    public void test1() {
    	System.out.println("startin test1");
    	List<Foo> all = fooRepository.getAll();
		System.out.println(all);
    	fooRepository.insertFoo(new Foo(0, all.size() + "a"));
    	fooRepository.updateFoo(new Foo(0, all.size() + "aaa"));
    	all = fooRepository.getAll();
		System.out.println(all);
    }
	
    public void batchInsert(int n, String names) {
    	System.out.println("startin test1");
    	List<Foo> all = fooRepository.getAll();
		System.out.println(all);
		List<Foo> fooToInsert = new ArrayList<>();
		for (int i = all.size(); i < all.size() + n; i++)
			fooToInsert.add(new Foo(names + i));
		fooRepository.batchInsert(fooToInsert);
    	all = fooRepository.getAll();
		System.out.println(all);
    }

}
