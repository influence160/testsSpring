package com.othmen.springtest.simplejdbc.test1.repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.othmen.springtest.simplejdbc.test1.entity.Foo;

@Repository
@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.MANDATORY)
public class DefaultFooRepository implements FooRepository{

	private SimpleJdbcInsert simpleJdbcInsert;
	private SimpleJdbcCall simpleJdbcCall;
	
	public DefaultFooRepository(DataSource dataSource) {
		this.simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("foo").usingColumns("name");
	}

	@Override
	public List<Foo> getAll() {
		System.out.println("getall()");
		return null;
//		return namedParameterJdbcTemplate.query("select * from foo ", new BeanPropertyRowMapper<Foo>(Foo.class));
	}

	@Override
	public Foo getFoo(String fooName) {
		return null;
		//return namedParameterJdbcTemplate.queryForObject("select * from foo where name = :name", new MapSqlParameterSource("name", fooName), Foo.class);
	}

	@Override
	public Foo getFoo(int id) {
		return null;
		//return namedParameterJdbcTemplate.queryForObject("select * from foo where id = :id", Collections.singletonMap("id", id), Foo.class);
	}

	@Override
	public void insertFoo(Foo foo) {

		Map<String, Object> map = new HashMap<>(1);
		map.put("name", foo.getName());
		SqlParameterSource source = new MapSqlParameterSource(map);
		
		Number key = simpleJdbcInsert.executeAndReturnKey(source);
		System.out.println("generated key = " + key.intValue());
	}

	@Override
	public void updateFoo(Foo foo) {
		//namedParameterJdbcTemplate.update("update foo set name = :name where id = :id", new BeanPropertySqlParameterSource(foo));
	}

	@Override
	public void batchInsert(List<Foo> fooToInsert) {
		simpleJdbcInsert.executeBatch(fooToInsert.stream().map(foo -> new BeanPropertySqlParameterSource(foo))
				.toArray(BeanPropertySqlParameterSource[]::new));
	}

}
