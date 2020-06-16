package com.othmen.springtest.simplejdbc.test1.entity;

import java.sql.ResultSet;

import org.springframework.jdbc.core.RowMapper;

public class Foo {
	
	public static final RowMapper<Foo> FooRowMapper = (ResultSet rs, int rowNum) -> {
		return new Foo(rs.getInt("id"), rs.getString("name"));
	};
	
	private int id;
	private String name;

	
	public Foo() {
	}
	
	public Foo(int id, String name) {
		this(name);
		this.id = id;
	}

	public Foo(String name) {
		this();
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return new StringBuilder().append("Foo[id=")
				.append(id)
				.append(", name=")
				.append(name)
				.append("]")
				.toString();
	}

}
