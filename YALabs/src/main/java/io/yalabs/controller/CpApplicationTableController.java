package io.yalabs.controller;

import java.math.BigInteger;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.yalabs.model.CpApplicationTable;
import io.yalabs.service.CpApplicactionTableService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api5")
public class CpApplicationTableController {
	@Autowired
	private CpApplicactionTableService detailService;	
	
	//To get all the data of the cp_document.
	@RequestMapping("/at")
	public List<CpApplicationTable> getAllDetails() {
		return detailService.getAllDetails();
	}
	//To get single row data of the document by its id variable.
	@RequestMapping("/at/{jobid}")
	public List<CpApplicationTable> getDetail(@PathVariable int jobid) {
		return detailService.getDetail(jobid);
	}
	//To post the values in the database.
	@Transactional
	@RequestMapping(value= "/at",method = RequestMethod.POST)
	public CpApplicationTable addDetail(@RequestBody CpApplicationTable detail) throws Exception {
	  detailService.addDetail(detail);
	  return detail;
	}
	//To update the value in database
	@Transactional
	@RequestMapping(method = RequestMethod.PUT, value= "/at/{jobid}")
	public void updateDetail(@RequestBody CpApplicationTable detail,@PathVariable BigInteger jobid ) {
		detailService.updateDetail(detail,jobid);
	}
	//To delete particular row by it's id.
	@Transactional
	@RequestMapping(method = RequestMethod.DELETE, value= "/at/{jobid}")
	public void deleteDetail(@PathVariable int jobid) {	
		detailService.deleteDetail(jobid);
	}
}
