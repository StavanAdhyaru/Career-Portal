package io.yalabs.controller;

import java.math.BigInteger;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.yalabs.model.CpUsers;
import io.yalabs.service.CpUsersService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CpUsersController {
	@Autowired
	
	private CpUsersService detailService;	
	//To get all the data.
	@RequestMapping("/users")
	public List<CpUsers> getAllDetails() {
		return detailService.getAllDetails();
	}
	//To get single row data of the document by its id variable.
	@RequestMapping("/users/{id}")
	public CpUsers getDetail(@PathVariable int id) {
		return detailService.getDetail(id);
	}
	//To post the values in the database.
	@Transactional
	@RequestMapping(method = RequestMethod.POST, value= "/users")
	public CpUsers addDetail(@RequestBody CpUsers detail) throws Exception {
	  detailService.addDetail(detail);
	 return detail;
	}
	//To update the value in database
	@Transactional
	@RequestMapping(method = RequestMethod.PUT, value= "/users/{id}")
	public void updateDetail(@RequestBody CpUsers detail,@PathVariable BigInteger id ) {
		detailService.updateDetail(detail,id);
	}
	//To delete particular row by it's id.  
	@Transactional
	@RequestMapping(method = RequestMethod.DELETE, value= "/users/{id}")
	public void deleteDetail(@PathVariable int id) {	
		detailService.deleteDetail(id);
	}
	

}
