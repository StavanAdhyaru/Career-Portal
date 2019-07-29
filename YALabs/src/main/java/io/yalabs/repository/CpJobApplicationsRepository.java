package io.yalabs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.yalabs.model.CpJobApplications;

public interface CpJobApplicationsRepository extends CrudRepository<CpJobApplications,String>{
	@Query(value = "select * from cp_job_applications where id=?1", nativeQuery = true)
	public CpJobApplications findDetailById(int id);

	@Query(value = "delete from cp_job_applications where id=?1", nativeQuery = true)
	public void deleteDetailById(int id);
}
