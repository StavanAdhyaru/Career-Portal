package io.yalabs.controller;

import java.math.BigInteger;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.yalabs.model.CpJobStatus;
import io.yalabs.service.CpJobStatusService;



@RestController
public class CpJobStatusController {
@Autowired
	
	private CpJobStatusService detailService;	
	
//To get all the data.
	@RequestMapping("/jobStatus")
	public List<CpJobStatus> getAllDetails() {
		return detailService.getAllDetails();
	}
	//To get single row data of the document by its id variable.
	@RequestMapping("/jobStatus/{id}")
	public CpJobStatus getDetail(@PathVariable int id) {
		return detailService.getDetail(id);
	}
	//To post the values in the database.
	@Transactional
	@RequestMapping(method = RequestMethod.POST, value= "/jobStatus")
	public CpJobStatus addDetail(@RequestBody CpJobStatus detail) throws Exception {
	  detailService.addDetail(detail);
	  return detail;
	}
	//To update the value in database
	@Transactional
	@RequestMapping(method = RequestMethod.PUT, value= "/jobStatus/{id}")
	public void updateDetail(@RequestBody CpJobStatus detail,@PathVariable BigInteger id ) {
		detailService.updateDetail(detail,id);
	}
	//To delete particular row by it's id.  
	@Transactional
	@RequestMapping(method = RequestMethod.DELETE, value= "/jobStatus/{id}")
	public void deleteDetail(@PathVariable int id) {	
		detailService.deleteDetail(id);
	}
}
