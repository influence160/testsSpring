package com.othmen.springtest.simpletests.test2.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Foo {
	
	public static final class FooRowMapper implements RowMapper<Foo> {

		@Override
		public Foo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Foo(rs.getInt("id"), rs.getString("name"));
		}
		
	}
	
	private int id;
	private String name;
	
	
	
	public Foo(int id, String name) {
		super();
		this.id = id;
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
	
	

}
