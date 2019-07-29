package io.yalabs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.yalabs.model.CpApplicationTable;

public interface CpApplicationTableRepository extends CrudRepository<CpApplicationTable,String>{
	@Query(value = "select * from applicationtable where jobid=?1", nativeQuery = true)
	public List<CpApplicationTable> findDetailById(int jobid);

	@Query(value = "delete from applicationtable where jobid=?1", nativeQuery = true)
	public void deleteDetailById(int jobid);
}
