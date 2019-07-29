package io.yalabs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.yalabs.model.CpUserProfile;

public interface CpUserProfileRepository extends CrudRepository<CpUserProfile,String> {
	@Query(value = "select * from cp_user_profile where userid=?1", nativeQuery = true)
	public CpUserProfile findDetailById(int userid);

	@Query(value = "delete from cp_user_profile where id=?1", nativeQuery = true)
	public void deleteDetailById(int userid);
}
