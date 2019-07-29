package io.yalabs.service;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import io.yalabs.interfaces.CpUsersInterface;
import io.yalabs.model.CpUsers;
import io.yalabs.repository.CpUsersRepository;

@Service
public class CpUsersService implements CpUsersInterface{
	@Autowired
	private CpUsersRepository detailRepository;
		//implementation of all the methods of the interface CpUsersInterface 
	public List<CpUsers> getAllDetails() {

		List<CpUsers> details = new ArrayList<CpUsers>();
		try {
			detailRepository.findAll().forEach(details::add);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return details;

	}

	public CpUsers getDetail(int id) {
		try {
			detailRepository.findDetailById(id);
		} catch (NullPointerException e) {
			System.out.print(e);
		}
		return detailRepository.findDetailById(id);
	}

	public CpUsers addDetail(CpUsers detail) throws Exception {
		Date date = new Date();
		Timestamp dateFormate = new Timestamp(date.getTime());
		try {
			detail.setCreate_date(dateFormate);
			detail.setWrite_date(dateFormate);
			detailRepository.save(detail);
			
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		return detail;
	}

	public void updateDetail(CpUsers detail,BigInteger id) {
			detail.setId(id);
			detailRepository.save(detail);
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
