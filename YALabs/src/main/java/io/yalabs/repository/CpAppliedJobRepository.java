package io.yalabs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.yalabs.model.CpAppliedJob;
import io.yalabs.model.CpJobApplications;


public interface CpAppliedJobRepository extends CrudRepository<CpAppliedJob,String>{
	@Query(value = "select * from applies_job where userid=?1", nativeQuery = true)
	public List<CpAppliedJob> findDetailById(int userid);

	@Query(value = "delete from applies_job  where id=?1", nativeQuery = true)
	public void deleteDetailById(int id);
	
	@Query(value = "select * from applies_job where userid=?1 And jobid=?2",nativeQuery=true)
	public CpAppliedJob findSingleById(int usesrid,int jobid);
}
