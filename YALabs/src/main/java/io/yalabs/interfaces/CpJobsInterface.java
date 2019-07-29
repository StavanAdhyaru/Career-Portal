package io.yalabs.interfaces;

import java.math.BigInteger;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import io.yalabs.model.CpJobs;



public interface CpJobsInterface {
	public List<CpJobs> getAllDetails();
	public CpJobs getDetail(@PathVariable int id);
	public CpJobs addDetail(@RequestBody CpJobs detail) throws Exception;
	public void updateDetail(@RequestBody CpJobs detail,@PathVariable BigInteger id );
	public void deleteDetail(@PathVariable int id);
}
