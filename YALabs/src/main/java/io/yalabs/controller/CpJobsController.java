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

import io.yalabs.model.CpJobs;
import io.yalabs.service.CpJobsService;


@RestController
@CrossOrigin(origins = "*" , allowedHeaders="*")
@RequestMapping("/api2")
public class CpJobsController {
@Autowired
	
	private CpJobsService detailService;	
//To get all the data. 
	@RequestMapping("/jobs")
	public List<CpJobs> getAllDetails() {
		return detailService.getAllDetails();
	}
	//To get single row data of the document by its id variable.
	@RequestMapping("/jobs/{id}")
	public CpJobs getDetail(@PathVariable int id) {
		return detailService.getDetail(id);
	}
	//To post the values in the database.
	@Transactional
	@RequestMapping(value= "/jobs",method = RequestMethod.POST)
	public void addDetail(@RequestBody CpJobs detail) throws Exception {
	  detailService.addDetail(detail);
	  //return detail;
	}
	//To update the value in database
	@Transactional
	@RequestMapping(method = RequestMethod.PUT, value= "/jobs/{id}")
	public void updateDetail(@RequestBody CpJobs detail,@PathVariable BigInteger id ) {
		detailService.updateDetail(detail,id);
	}
	//To delete particular row by it's id.  
	@Transactional
	@RequestMapping(method = RequestMethod.DELETE, value= "/jobs/{id}")
	public void deleteDetail(@PathVariable int id) {	
		detailService.deleteDetail(id);
	}
}
