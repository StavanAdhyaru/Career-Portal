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

import io.yalabs.model.CpLast;
import io.yalabs.service.CpLastService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api6")
public class CpLastController {

@Autowired
	
	private CpLastService detailService;	
	//To get all the data.
	@RequestMapping("/la")
	public List<CpLast> getAllDetails() {
		return detailService.getAllDetails();
	}
	//To get single row data of the document by its id variable.
	@RequestMapping("/la/{jobid}")
	public CpLast getDetail(@PathVariable int jobid) {
		return detailService.getDetail(jobid);
	}
	//To post the values in the database.
	@Transactional
	@RequestMapping(method = RequestMethod.POST, value= "/la")
	public CpLast addDetail(@RequestBody CpLast detail) throws Exception {
	  detailService.addDetail(detail);
	 return detail;
	}
	//To update the value in database
	@Transactional
	@RequestMapping(method = RequestMethod.PUT, value= "/la/{jobid}")
	public void updateDetail(@RequestBody CpLast detail,@PathVariable BigInteger jobid ) {
		detailService.updateDetail(detail,jobid);
	}
	//To delete particular row by it's id.  
	@Transactional
	@RequestMapping(method = RequestMethod.DELETE, value= "/la/{jobid}")
	public void deleteDetail(@PathVariable int jobid) {	
		detailService.deleteDetail(jobid);
	}
}
