package com.othmen.springtest.templates.test1.repository;

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
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.othmen.springtest.templates.test1.entity.Foo;

@Repository
@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.MANDATORY)
public class DefaultFooRepository implements FooRepository{
	
	protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public DefaultFooRepository(DataSource dataSource) {
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public List<Foo> getAll() {
		return namedParameterJdbcTemplate.query("select * from foo ", new BeanPropertyRowMapper<Foo>(Foo.class));
	}

	@Override
	public Foo getFoo(String fooName) {
		
		return namedParameterJdbcTemplate.queryForObject("select * from foo where name = :name", new MapSqlParameterSource("name", fooName), Foo.class);
	}

	@Override
	public Foo getFoo(int id) {
		return namedParameterJdbcTemplate.queryForObject("select * from foo where id = :id", Collections.singletonMap("id", id), Foo.class);
	}

	@Override
	public void insertFoo(Foo foo) {
		GeneratedKeyHolder keyyHolder = new GeneratedKeyHolder();

		Map<String, Object> map = new HashMap<>(1);
		map.put("name", foo.getName());
		SqlParameterSource source = new MapSqlParameterSource(map);
		
		namedParameterJdbcTemplate.update("insert into foo (name) values (:name)", source, keyyHolder, new String[] {"id"});
		System.out.println("generated key = " + keyyHolder.getKey());
	}

	@Override
	public void updateFoo(Foo foo) {
		namedParameterJdbcTemplate.update("update foo set name = :name where id = :id", new BeanPropertySqlParameterSource(foo));
	}

	@Override
	public void batchInsert(List<Foo> fooToInsert) {
		namedParameterJdbcTemplate.batchUpdate("insert into foo (name) values (:name)",
				fooToInsert.stream().map(foo -> new BeanPropertySqlParameterSource(foo))
				.toArray(BeanPropertySqlParameterSource[]::new));
	}

}
