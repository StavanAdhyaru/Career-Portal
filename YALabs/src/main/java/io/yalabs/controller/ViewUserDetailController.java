package io.yalabs.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.yalabs.model.CpUsers;
import io.yalabs.model.ViewUserDetails;
import io.yalabs.service.ViewUserDetailService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/viewUsers")
public class ViewUserDetailController {
	@Autowired
	private ViewUserDetailService detailService;	
@RequestMapping("/detailUsers")
public List<ViewUserDetails> getAllDetails() {
	return detailService.getAllDetails();
}
@RequestMapping(method = RequestMethod.PUT,value="/isActive")
public void  updateIsAdmin(@RequestBody ViewUserDetails detail,@PathVariable BigInteger id) {
	detailService.IsActiveUpdate(detail, id);
}
@RequestMapping(value="/activeId/{userid}")
public ViewUserDetails getDetail(@PathVariable BigInteger userid) {
	return detailService.getDetail(userid);
}
}
