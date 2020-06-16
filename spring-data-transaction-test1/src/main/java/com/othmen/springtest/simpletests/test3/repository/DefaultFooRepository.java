package com.othmen.springtest.simpletests.test3.repository;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import com.othmen.springtest.simpletests.test3.entity.Foo;
import com.othmen.springtest.simpletests.test3.entity.Foo.FooRowMapper;

public class DefaultFooRepository extends JdbcTemplate implements FooRepository{
	
	public DefaultFooRepository(DataSource dataSource) {
		super(dataSource);
	}

	@Override
	public Foo getFoo(String fooName) {
		return super.queryForObject("select * from foo where name = ?", new Object[] { fooName } , new FooRowMapper());
	}

	@Override
	public Foo getFoo(int id) {
		return super.queryForObject("select * from foo where id = ?", new Object[] { id } , new FooRowMapper());
	}

	@Override
	public void insertFoo(Foo foo) {
		super.update("insert into foo values (?, ?)", foo.getId(), foo.getName());
	}

	@Override
	public void updateFoo(Foo foo) {
		super.update("update foo set name = ? where id = ?", foo.getName(), foo.getId());
	}

}
