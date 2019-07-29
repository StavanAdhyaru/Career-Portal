package io.yalabs.interfaces;

import java.math.BigInteger;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import io.yalabs.model.CpJobStatus;


public interface CpJobStatusInterface {
	public List<CpJobStatus> getAllDetails();
	public CpJobStatus getDetail(@PathVariable int id);
	public CpJobStatus addDetail(@RequestBody CpJobStatus detail) throws Exception;
	public void updateDetail(@RequestBody CpJobStatus detail,@PathVariable BigInteger id );
	public void deleteDetail(@PathVariable int id);
}
