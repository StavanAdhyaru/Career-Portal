package io.yalabs.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.yalabs.model.CpUsers;


public interface CpUsersRepository extends CrudRepository<CpUsers,String> {
	@Query(value = "select * from cp_users where id=?1", nativeQuery = true)
	public CpUsers findDetailById(int id);

	@Query(value = "delete from cp_users where id=?1", nativeQuery = true)
	public void deleteDetailById(int id);

}
