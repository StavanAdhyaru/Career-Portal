package io.yalabs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.yalabs.model.CpLast;



public interface CpLastRepository extends CrudRepository<CpLast,String> {
	@Query(value = "select * from last_table where jobid=?1", nativeQuery = true)
	public CpLast findDetailById(int jobid);

	@Query(value = "delete from last_table where jobid=?1", nativeQuery = true)
	public void deleteDetailById(int jobid);

}
