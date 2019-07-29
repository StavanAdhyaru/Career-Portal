package io.yalabs.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import io.yalabs.interfaces.CpUserProfileInterface;
import io.yalabs.model.CpUserProfile;
import io.yalabs.repository.CpUserProfileRepository;
@Service
public class CpUserProfileService implements CpUserProfileInterface{
	@Autowired
	private CpUserProfileRepository detailRepository;
	//implementation of all the methods of the interface CpUserProfileInterface
	public List<CpUserProfile> getAllDetails() {

		List<CpUserProfile> details = new ArrayList<CpUserProfile>();
		try {
			detailRepository.findAll().forEach(details::add);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return details;

	}

	public CpUserProfile getDetail(int userid) {
		
		try {
			detailRepository.findDetailById(userid);
		} catch (NullPointerException e) {
			System.out.print(e);
		}
		return detailRepository.findDetailById(userid);
	}

	public CpUserProfile addDetail(CpUserProfile detail) throws Exception {
		
		try {
			detailRepository.save(detail);
			
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		return detail;
	}

	public void updateDetail(CpUserProfile detail,BigInteger userid) {
		try {
			detail.setId(userid);
			detailRepository.save(detail);
			
			
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}

	public void deleteDetail(int userid) {
		try {
			detailRepository.deleteDetailById(userid);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		catch(JpaSystemException e) {
			System.out.println(e);
		}
	}
}
