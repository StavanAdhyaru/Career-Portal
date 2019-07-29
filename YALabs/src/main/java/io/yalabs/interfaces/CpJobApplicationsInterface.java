package io.yalabs.interfaces;

import java.math.BigInteger;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import io.yalabs.model.CpJobApplications;



public interface CpJobApplicationsInterface {
	public List<CpJobApplications> getAllDetails();
	public CpJobApplications getDetail(@PathVariable int id);
	public CpJobApplications addDetail(@RequestBody CpJobApplications detail) throws Exception;
	public void updateDetail(@RequestBody CpJobApplications detail,@PathVariable BigInteger id );
	public void deleteDetail(@PathVariable int id);
}
