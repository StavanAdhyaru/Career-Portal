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

import io.yalabs.model.CpAppliedJob;
import io.yalabs.service.CpAppliedJobService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api4")
public class CpAppliedJobController {

	@Autowired
	private CpAppliedJobService detailService;	
	
	//To get all the data of the cp_document.
	@RequestMapping("/jid")
	public List<CpAppliedJob> getAllDetails() {
		return detailService.getAllDetails();
	}
	//To get single row data of the document by its id variable.
	@RequestMapping("/jid/{id}")
	public List<CpAppliedJob> getDetail(@PathVariable int id) {
		return detailService.getDetail(id);
	}
	@RequestMapping("/jid/{userid}/{jobid}")
	public CpAppliedJob getSingleDetail(@PathVariable int userid,@PathVariable int jobid) {
		return detailService.getSingleDetail(userid,jobid);
	}
	//To post the values in the database.
	@Transactional
	@RequestMapping(value= "/jid",method = RequestMethod.POST)
	public CpAppliedJob addDetail(@RequestBody CpAppliedJob detail) throws Exception {
	  detailService.addDetail(detail);
	  return detail;
	}
	//To update the value in database
	@Transactional
	@RequestMapping(method = RequestMethod.PUT, value= "/jid/{id}")
	public void updateDetail(@RequestBody CpAppliedJob detail,@PathVariable BigInteger id ) {
		detailService.updateDetail(detail,id);
	}
	//To delete particular row by it's id.
	@Transactional
	@RequestMapping(method = RequestMethod.DELETE, value= "/jid/{id}")
	public void deleteDetail(@PathVariable int id) {	
		detailService.deleteDetail(id);
	}
}
