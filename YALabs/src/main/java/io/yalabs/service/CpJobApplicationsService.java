package io.yalabs.service;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import io.yalabs.interfaces.CpJobApplicationsInterface;
import io.yalabs.model.CpJobApplications;
import io.yalabs.repository.CpJobApplicationsRepository;

@Service
public class CpJobApplicationsService implements CpJobApplicationsInterface{
	@Autowired
	private CpJobApplicationsRepository detailRepository;
	//implementation of all the methods of the interface CpJobApplicationsInterface
	public List<CpJobApplications> getAllDetails() {

		List<CpJobApplications> details = new ArrayList<CpJobApplications>();
		try {
			detailRepository.findAll().forEach(details::add);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return details;

	}

	public CpJobApplications getDetail(int id) {
	
		try {
			detailRepository.findDetailById(id);
		} catch (NullPointerException e) {
			System.out.print(e);
		}
		return detailRepository.findDetailById(id);
	}

	public CpJobApplications addDetail(CpJobApplications detail) throws Exception {
		
		try {
			Date date = new Date();
			Timestamp dateFormate = new Timestamp(date.getTime());
			detail.setCreate_uid(BigInteger.ONE);
			detail.setWrite_uid(BigInteger.ONE);
			detail.setCreate_date(dateFormate);
			detail.setWrite_date(dateFormate);
			detailRepository.save(detail);
			
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		return detail;
	}

	public void updateDetail(CpJobApplications detail, BigInteger id) {
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
