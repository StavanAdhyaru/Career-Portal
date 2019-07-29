package io.yalabs.interfaces;

import java.math.BigInteger;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import io.yalabs.model.CpUserProfile;

public interface CpUserProfileInterface {
	public List<CpUserProfile> getAllDetails();
	public CpUserProfile getDetail(@PathVariable int id);
	public CpUserProfile addDetail(@RequestBody CpUserProfile detail) throws Exception;
	public void updateDetail(@RequestBody CpUserProfile detail,@PathVariable BigInteger id );
	public void deleteDetail(@PathVariable int id);
}
