package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.data.Foo;
import com.example.demo.data.FooRepository;

//@SpringBootTest
@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE) pour utiliser la base de données réelle
class SpringDataJpaTestApplicationTests {
	
	@Autowired
	private TestEntityManager testEntityManager;
	
	@Autowired
	private FooRepository fooRepository;

//	@Test
//	void contextLoads() {
//	}
//	
	@Test
//	@Transactional(propagation = Propagation.NOT_SUPPORTED)// pour Desactiver la transaction (qui est active par defaut avec @DataJpaTest)
	public void test1() {
		Foo foo1 = fooRepository.findAllById(1);
		Foo foo12 = testEntityManager.find(Foo.class, 1);

		Assertions.assertThat(foo1.getId() == 1);
		Assertions.assertThat(foo1.getId() == foo12.getId());
	}

}
