package io.yalabs.controller;
import java.math.BigInteger;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.yalabs.model.CpUserProfile;
import io.yalabs.model.CpUsers;
import io.yalabs.model.CreateUserModel;
import io.yalabs.service.LoginService;




@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api9")public class LoginController {

	@Autowired
	
	private LoginService detailService;	
	@RequestMapping(method = RequestMethod.POST, value="/login")
	public CpUsers getDetail(@RequestBody CpUsers detail) throws Exception {
		CpUsers x = new CpUsers();
		if(detail.getUsername()==null || detail.getPassword()==null) {
			
		}
		x=detailService.LoginDetail(detail.getUsername(),detail.getPassword());
		return x;
	
	}
	@RequestMapping(method=RequestMethod.POST,value="/addUser")
	public CpUsers createUser(@RequestBody CreateUserModel detail) throws Exception{
		CpUsers m =new CpUsers();
		m=detailService.createUser(detail);
		return m;
	}
	@RequestMapping(method=RequestMethod.POST,value="/addAdmin")
	public CpUsers createAdmin(@RequestBody CreateUserModel detail) throws Exception{
		CpUsers m =new CpUsers();
		m=detailService.createAdmin(detail);
		return m;
	}

}
