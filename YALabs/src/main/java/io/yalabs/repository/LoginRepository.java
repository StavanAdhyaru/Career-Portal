package io.yalabs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.yalabs.model.CpUsers;

public interface LoginRepository extends CrudRepository<CpUsers,String> {
	@Query(value = "select * from cp_users where username=?1 And Password=?2 And isActive='true'", nativeQuery = true)
	public CpUsers check(String username,String password);
}
