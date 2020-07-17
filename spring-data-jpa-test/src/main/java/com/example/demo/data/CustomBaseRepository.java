package com.example.demo.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

/**
 * Custom interface alternative to CrudRepository<T, ID>
 * @author user
 *
 * @param <T>
 * @param <ID>
 */
@NoRepositoryBean
//@RepositoryDefinition equivalent a extends Repository<T, ID>
public interface CustomBaseRepository<T, ID> extends Repository<T, ID> {

	<S extends T> S save(S entity);

	<S extends T> Iterable<S> saveAll(Iterable<S> entities);

	Optional<T> findById(ID id);

	boolean existsById(ID id);

	List<T> findAll();

	List<T> findAllById(Iterable<ID> ids);

	long count();

	void deleteById(ID id);

	void delete(T entity);

}