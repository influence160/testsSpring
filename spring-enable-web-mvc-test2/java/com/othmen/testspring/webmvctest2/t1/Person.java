package com.othmen.testspring.webmvctest2.t1;

import org.springframework.core.convert.converter.Converter;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

public class Person {
	
	public static class PersonTOStringConverter implements Converter<Person, String>{

		@Override
		public String convert(Person source) {
			return source.toString();
		}
		
	}
	
//	@JsonProperty
//	@JsonView(Views.Public.class)
	private String nom;
	private String prenom;
//	@JsonProperty
//	@JsonView(Views.Public.class)
	private int age;

	public Person(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return"Person[" + nom + "," + prenom + "," + age + "]";
	}
}
