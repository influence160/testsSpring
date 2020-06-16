package com.othmen.springtest.simpletests.test2.repository;

import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.othmen.springtest.simpletests.test2.entity.Foo;
import com.othmen.springtest.simpletests.test2.entity.Foo.FooRowMapper;

public class DefaultFooRepository extends JdbcDaoSupport implements FooRepository{

	
	public DefaultFooRepository(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Foo getFoo(String fooName) {
		return getJdbcTemplate().queryForObject("select * from foo where name = ?", new Object[] { fooName } , new FooRowMapper());
	}

	@Override
	public Foo getFoo(int id) {
		return getJdbcTemplate().queryForObject("select * from foo where id = ?", new Object[] { id } , new FooRowMapper());
	}

	@Override
	public void insertFoo(Foo foo) {
		getJdbcTemplate().update("insert into foo values (?, ?)", foo.getId(), foo.getName());
	}

	@Override
	public void updateFoo(Foo foo) {
		getJdbcTemplate().update("update foo set name = ? where id = ?", foo.getName(), foo.getId());
	}

}
