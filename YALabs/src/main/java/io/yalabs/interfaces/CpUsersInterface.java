package io.yalabs.interfaces;

import java.math.BigInteger;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import io.yalabs.model.CpUsers;

public interface CpUsersInterface {
	public List<CpUsers> getAllDetails();
	public CpUsers getDetail(@PathVariable int id);
	public CpUsers addDetail(@RequestBody CpUsers detail) throws Exception;
	public void updateDetail(@RequestBody CpUsers detail,@PathVariable BigInteger id );
	public void deleteDetail(@PathVariable int id);
}
