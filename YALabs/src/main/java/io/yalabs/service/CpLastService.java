package io.yalabs.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import io.yalabs.model.CpLast;
import io.yalabs.repository.CpLastRepository;



@Service
public class CpLastService {
	@Autowired
	private CpLastRepository detailRepository;
		//implementation of all the methods of the interface CpUsersInterface 
	public List<CpLast> getAllDetails() {

		List<CpLast> details = new ArrayList<CpLast>();
		try {
			detailRepository.findAll().forEach(details::add);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return details;

	}

	public CpLast getDetail(int jobid) {
		
		try {
			detailRepository.findDetailById(jobid);
		} catch (NullPointerException e) {
			System.out.print(e);
		}
		return detailRepository.findDetailById(jobid);
	}

	public CpLast addDetail(CpLast detail) throws Exception {
		
		try {
			detailRepository.save(detail);
			
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		return detail;
	}

	public void updateDetail(CpLast detail,BigInteger jobid) {
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
