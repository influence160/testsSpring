package com.example.demo.data;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

public interface FooRepository extends CustomBaseRepository<Foo, Long> { //extends CrudRepository
	List<Foo> findByName(String name);
	

	
	@Query("select f from Foo f where name = ?1") 
	Foo getThning(String name);
	
	//See named query in Foo.class
	String findAaa();
		
	List<Foo> findByIdBetween(int i, int j);
	
	//les methodes ci dessous genere une exception au démarrage

//	Foo findFirstIdMax();
//	Foo findFirstByIdMax();
//	int findMaxId();
	
	//Autres tests

	String findAllById(short id);
	Foo findAllById(int id);
	
	List<Foo> getById(long id);
	Foo getAllById(int id);
	List<Foo> getById(int id);
}
