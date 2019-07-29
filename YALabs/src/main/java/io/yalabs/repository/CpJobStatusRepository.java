package io.yalabs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.yalabs.model.CpJobStatus;


public interface CpJobStatusRepository extends CrudRepository<CpJobStatus,String>{
	@Query(value = "select * from cp_job_status where id=?1", nativeQuery = true)
	public CpJobStatus findDetailById(int id);

	@Query(value = "delete from cp_job_status where id=?1", nativeQuery = true)
	public void deleteDetailById(int id);
}
