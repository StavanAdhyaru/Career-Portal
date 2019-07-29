package io.yalabs.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import io.yalabs.model.CpApplicationTable;
import io.yalabs.repository.CpApplicationTableRepository;


@Service
public class CpApplicactionTableService {
	@Autowired
	private CpApplicationTableRepository detailRepository;
	//implementation of all the methods of the interface CpDocumentsInterface
	public List<CpApplicationTable> getAllDetails() {

		List<CpApplicationTable> details = new ArrayList<CpApplicationTable>();
		try {
			detailRepository.findAll().forEach(details::add);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return details;

	}

	public List<CpApplicationTable> getDetail(int jobid) {
		List<CpApplicationTable> details = new ArrayList<CpApplicationTable>();
		try {
			detailRepository.findDetailById(jobid).forEach(details::add);
		} catch (NullPointerException e) {
			System.out.print(e);
		}
		return details;
	}

	public CpApplicationTable addDetail(CpApplicationTable detail) throws Exception {
		
		try {
			detailRepository.save(detail);
			
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		return detail;
	}

	public void updateDetail(CpApplicationTable detail,BigInteger jobid) {
		try {
			detail.setJobid(jobid);
			detailRepository.save(detail);
			
			
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}

	public void deleteDetail(int jobid) {
		try {
			detailRepository.deleteDetailById(jobid);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		catch(JpaSystemException e) {
			System.out.println(e);
		}
	}
}
