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

import io.yalabs.model.CpUserProfile;
import io.yalabs.service.CpUserProfileService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api1")
public class CpUserProfileController {
@Autowired
	
	private CpUserProfileService detailService;	
//To get all the data.
	@RequestMapping("/userProfile")
	public List<CpUserProfile> getAllDetails() {
		return detailService.getAllDetails();
	}
	//To get single row data of the document by its id variable.
	@RequestMapping("/userProfile/{userid}")
	public CpUserProfile getDetail(@PathVariable int userid) {
		return detailService.getDetail(userid);
	}
	
	//To post the values in the database.
	@Transactional
	@RequestMapping( value= "/userProfile",method = RequestMethod.POST)
	public CpUserProfile addDetail(@RequestBody CpUserProfile detail) throws Exception {
	  detailService.addDetail(detail);
	  return detail;
	}
	//To update the value in database
	@Transactional
	@RequestMapping(method = RequestMethod.PUT, value= "/userProfile/{userid}")
	public void updateDetail(@RequestBody CpUserProfile detail,@PathVariable BigInteger userid ) {
		detailService.updateDetail(detail,userid);
	}
	//To delete particular row by it's id.  
	@Transactional
	@RequestMapping(method = RequestMethod.DELETE, value= "/userProfile/{userid}")
	public void deleteDetail(@PathVariable int userid) {	
		detailService.deleteDetail(userid);
	}
}
