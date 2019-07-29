package io.yalabs.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.yalabs.model.CpUsers;
import io.yalabs.model.ViewUserDetails;
import io.yalabs.repository.CpUserProfileRepository;
import io.yalabs.repository.CpUsersRepository;
import io.yalabs.repository.LoginRepository;
import io.yalabs.repository.ViewUserDetailRepository;


@Service
public class ViewUserDetailService {
	@Autowired
	private ViewUserDetailRepository detailRepository;
	@Autowired
	private CpUsersRepository dRepo;
	@Autowired
	private CpUsersService UService;
	public List<ViewUserDetails> getAllDetails() {
	
		
		List<ViewUserDetails> details = new ArrayList<ViewUserDetails>();
		try {
			detailRepository.findAll().forEach(details::add);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return details;

	}
	
	public void IsActiveUpdate(ViewUserDetails detail,BigInteger id) {
		try {
			CpUsers user = new CpUsers();
		//	user = UService.getDetail(id);
			user.setIsactive(detail.isIsactive());
			UService.updateDetail(user,id);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	

	}
	
public ViewUserDetails getDetail(BigInteger userid) {
		
		try {
			CpUsers user = new CpUsers();
			ViewUserDetails view = new ViewUserDetails();
			int b1 = userid.intValue(); 
			view = detailRepository.findDetailById(userid);
			user = UService.getDetail(b1);
			user.setIsactive(!view.isIsactive());
			UService.updateDetail(user,userid);
			
			
		} catch (NullPointerException e) {
			System.out.print(e);
		}
		return detailRepository.findDetailById(userid);
	}
}
