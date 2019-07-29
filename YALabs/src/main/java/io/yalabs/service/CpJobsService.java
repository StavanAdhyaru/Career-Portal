package io.yalabs.service;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import io.yalabs.interfaces.CpJobsInterface;
import io.yalabs.model.CpJobs;
import io.yalabs.repository.CpJobsRepository;



@Service
public class CpJobsService implements CpJobsInterface{
	@Autowired
	private CpJobsRepository detailRepository;
	//implementation of all the methods of the interface CpJobsInterface
	public List<CpJobs> getAllDetails() {

		List<CpJobs> details = new ArrayList<CpJobs>();
		try {
			detailRepository.findAll().forEach(details::add);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return details;

	}

	public CpJobs getDetail(int id) {
		try {
			detailRepository.findDetailById(id);
		} catch (NullPointerException e) {
			System.out.print(e);
		}
		return detailRepository.findDetailById(id);
	}

	public CpJobs addDetail(CpJobs detail) throws Exception {
		Date date = new Date();
		Timestamp dateFormate = new Timestamp(date.getTime());
		try {
			
			detail.setCreate_date(dateFormate);
			detail.setWrite_date(dateFormate);
			detail.setCreate_uid(detail.getCreate_uid());
			detail.setWrite_uid(detail.getCreate_uid());
			detailRepository.save(detail);
			
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		return detail;
	}

	public void updateDetail(CpJobs detail, BigInteger id) {
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
