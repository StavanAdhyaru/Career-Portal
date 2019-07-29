package io.yalabs.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import io.yalabs.model.CpApplicationTable;
import io.yalabs.model.CpAppliedJob;
import io.yalabs.repository.CpAppliedJobRepository;

@Service
public class CpAppliedJobService {
	@Autowired
	private CpAppliedJobRepository detailRepository;
	//implementation of all the methods of the interface CpDocumentsInterface
	public List<CpAppliedJob> getAllDetails() {

		List<CpAppliedJob> details = new ArrayList<CpAppliedJob>();
		try {
			detailRepository.findAll().forEach(details::add);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return details;

	}

	public List<CpAppliedJob> getDetail(int userid) {
		List<CpAppliedJob> details = new ArrayList<CpAppliedJob>();
		try {
			detailRepository.findDetailById(userid).forEach(details::add);
		} catch (NullPointerException e) {
			System.out.print(e);
		}
		return details;
	}
	public CpAppliedJob getSingleDetail(int userid,int jobid) {
		try {
			detailRepository.findSingleById(userid,jobid);
		}catch(Exception e) {
			
		}
		return detailRepository.findSingleById(userid, jobid);
	}
	public CpAppliedJob addDetail(CpAppliedJob detail) throws Exception {
		
		try {
			detailRepository.save(detail);
			
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		return detail;
	}

	public void updateDetail(CpAppliedJob detail,BigInteger id) {
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
