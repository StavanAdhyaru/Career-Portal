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

import io.yalabs.model.CpDocuments;
import io.yalabs.service.CpDocumentService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api3")
public class CpDocumentsController {
@Autowired
	
	private CpDocumentService detailService;	
	
	//To get all the data of the cp_document.
	@RequestMapping("/documents")
	public List<CpDocuments> getAllDetails() {
		return detailService.getAllDetails();
	}
	//To get single row data of the document by its id variable.
	@RequestMapping("/documents/{id}")
	public CpDocuments getDetail(@PathVariable int id) {
		return detailService.getDetail(id);
	}
	//To post the values in the database.
	@Transactional
	@RequestMapping(value= "/documents",method = RequestMethod.POST)
	public CpDocuments addDetail(@RequestBody CpDocuments detail) throws Exception {
	  detailService.addDetail(detail);
	  return detail;
	}
	//To update the value in database
	@Transactional
	@RequestMapping(method = RequestMethod.PUT, value= "/documents/{id}")
	public void updateDetail(@RequestBody CpDocuments detail,@PathVariable BigInteger id ) {
		detailService.updateDetail(detail,id);
	}
	//To delete particular row by it's id.
	@Transactional
	@RequestMapping(method = RequestMethod.DELETE, value= "/documents/{id}")
	public void deleteDetail(@PathVariable int id) {	
		detailService.deleteDetail(id);
	}
}
