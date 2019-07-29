package io.yalabs.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import io.yalabs.interfaces.CpDocumentsInterface;
import io.yalabs.model.CpDocuments;
import io.yalabs.repository.CpDocumentsRepository;



@Service
public class CpDocumentService implements CpDocumentsInterface{
	@Autowired
	private CpDocumentsRepository detailRepository;
	//implementation of all the methods of the interface CpDocumentsInterface
	public List<CpDocuments> getAllDetails() {

		List<CpDocuments> details = new ArrayList<CpDocuments>();
		try {
			detailRepository.findAll().forEach(details::add);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return details;

	}

	public CpDocuments getDetail(int id) {
		
		try {
			detailRepository.findDetailById(id);
		} catch (NullPointerException e) {
			System.out.print(e);
		}
		return detailRepository.findDetailById(id);
	}

	public CpDocuments addDetail(CpDocuments detail) throws Exception {
		
		try {
			detailRepository.save(detail);
			
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		return detail;
	}

	public void updateDetail(CpDocuments detail,BigInteger id) {
		try {
			detail.setId(id);
			detailRepository.save(detail);
			
			
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}

	public void deleteDetail(int id) {
		try {
			detailRepository.deleteDetailById(id);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		catch(JpaSystemException e) {
			System.out.println(e);
		}
	}
}
