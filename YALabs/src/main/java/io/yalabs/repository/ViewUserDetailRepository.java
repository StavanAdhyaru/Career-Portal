package io.yalabs.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.yalabs.model.CpUsers;
import io.yalabs.model.ViewUserDetails;
public interface ViewUserDetailRepository extends CrudRepository<ViewUserDetails,String>  {
	@Query(value = "select * from view_user_details where userid=?1", nativeQuery = true)
	public ViewUserDetails findDetailById(BigInteger userid);

}
