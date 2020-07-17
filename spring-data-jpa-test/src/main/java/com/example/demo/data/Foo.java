package com.example.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Foo.findAaa", query = "select f.name from Foo f where f.name = 'aaa'")
public class Foo {
	
	@Id()
	@GeneratedValue
	private int id;
	
	@Column
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
