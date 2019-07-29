package io.yalabs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.yalabs.model.CpJobs;

public interface CpJobsRepository extends CrudRepository<CpJobs,String> {
	@Query(value = "select * from cp_jobs where id=?1", nativeQuery = true)
	public CpJobs findDetailById(int id);

	@Query(value = "delete from cp_jobs where id=?1", nativeQuery = true)
	public void deleteDetailById(int id);
}
