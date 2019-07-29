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

import io.yalabs.model.CpJobApplications;
import io.yalabs.service.CpJobApplicationsService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api7")
public class CpJobApplicationsController {

	@Autowired
	private CpJobApplicationsService detailService;
	//To get all the data.
	@RequestMapping("/jobApplications")
	public List<CpJobApplications> getAllDetails() {
		return detailService.getAllDetails();
	}
	//To get single row data of the document by its id variable.
	@RequestMapping("/jobApplications/{id}")
	public CpJobApplications getDetail(@PathVariable int id) {
		return detailService.getDetail(id);
	}
	//To post the values in the database.
	@Transactional
	@RequestMapping(method = RequestMethod.POST, value= "/jobApplications")
	public CpJobApplications addDetail(@RequestBody CpJobApplications detail) throws Exception {
	  detailService.addDetail(detail);
	  return detail;
	}
	//To update the value in database
	@Transactional
	@RequestMapping(method = RequestMethod.PUT, value= "/jobApplications/{id}")
	public void updateDetail(@RequestBody CpJobApplications detail,@PathVariable BigInteger id ) {
		detailService.updateDetail(detail,id);
	}
	//To delete particular row by it's id.  
	@Transactional
	@RequestMapping(method = RequestMethod.DELETE, value= "/jobApplications/{id}")
	public void deleteDetail(@PathVariable int id) {	
		detailService.deleteDetail(id);
	}
}
