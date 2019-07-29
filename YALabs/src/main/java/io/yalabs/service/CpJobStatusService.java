package io.yalabs.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import io.yalabs.interfaces.CpJobStatusInterface;
import io.yalabs.model.CpJobStatus;
import io.yalabs.repository.CpJobStatusRepository;


@Service
public class CpJobStatusService implements CpJobStatusInterface{
	@Autowired
	private CpJobStatusRepository detailRepository;
	//implementation of all the methods of the interface CpJobStatusInterface
	public List<CpJobStatus> getAllDetails() {

		List<CpJobStatus> details = new ArrayList<CpJobStatus>();
		try {
			detailRepository.findAll().forEach(details::add);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return details;

	}

	public CpJobStatus getDetail(int id) {
	
		try {
			detailRepository.findDetailById(id);
		} catch (NullPointerException e) {
			System.out.print(e);
		}
		return detailRepository.findDetailById(id);
	}

	public CpJobStatus addDetail(CpJobStatus detail) throws Exception {
	
		try {
			detailRepository.save(detail);
			
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		return detail;
	}

	public void updateDetail(CpJobStatus detail,BigInteger id) {
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
