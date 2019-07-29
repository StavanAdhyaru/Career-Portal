package io.yalabs.interfaces;

import java.math.BigInteger;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import io.yalabs.model.CpDocuments;



public interface CpDocumentsInterface {
	public List<CpDocuments> getAllDetails();
	public CpDocuments getDetail(@PathVariable int id);
	public CpDocuments addDetail(@RequestBody CpDocuments detail) throws Exception;
	public void updateDetail(@RequestBody CpDocuments detail,@PathVariable BigInteger id );
	public void deleteDetail(@PathVariable int id);
}
