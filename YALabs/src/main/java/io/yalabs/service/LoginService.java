package io.yalabs.service;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.yalabs.model.CpUserProfile;
import io.yalabs.model.CpUsers;
import io.yalabs.model.CreateUserModel;
import io.yalabs.repository.CpUserProfileRepository;
import io.yalabs.repository.CpUsersRepository;
import io.yalabs.repository.LoginRepository;



@Service
public class LoginService {
	@Autowired
	private LoginRepository detailRepository;
	@Autowired
	private CpUsersRepository cpUsersRepository;
	@Autowired
	private CpUserProfileRepository cpUserProfileRepository;
	
	public CpUsers LoginDetail(String username,String password) {
		CpUsers x= new CpUsers();
		try {
			
			x=detailRepository.check(username,password);
			x.setPassword(null);
		} catch (NullPointerException e) {
			System.out.print(e);
		}
		return x;
	}
	public 	CpUsers createUser(CreateUserModel detail) throws Exception {
		CpUsers x = new CpUsers();
		CpUsers z = new CpUsers();
		CpUserProfile y =new CpUserProfile();
		Date date = new Date();
		Timestamp dateFormate = new Timestamp(date.getTime());

		try {
		x.setUsername(detail.getUsername());
		x.setPassword(detail.getPassword());
		x.setIsactive(true);
		x.setCreate_uid(BigInteger.ONE);
		x.setWrite_uid(BigInteger.ONE);
		z=cpUsersRepository.save(x);
		y.setIsactive(z.isIsactive());
		y.setUserid(z.getId());
		y.setCreate_date(dateFormate);
		y.setWrite_date(dateFormate);
		y.setDisplayname(detail.getDisplayname());
		y.setDob(detail.getDob());
		y.setCreate_uid(BigInteger.ONE);
		y.setWrite_uid(BigInteger.ONE);
		y.setMobile(detail.getMobile());
		y.setEmail(z.getUsername());
		cpUserProfileRepository.save(y);
		}
		catch(Exception e) {
			
		}
		return x;
}
	public 	CpUsers createAdmin(CreateUserModel detail) throws Exception {
		CpUsers x = new CpUsers();
		CpUsers z = new CpUsers();
		CpUserProfile y =new CpUserProfile();
		Date date = new Date();
		Timestamp dateFormate = new Timestamp(date.getTime());

		try {
		x.setUsername(detail.getUsername());
		x.setPassword(detail.getPassword());
		x.setIsactive(true);
		x.setIsadmin(true);
		x.setCreate_uid(detail.getCreate_uid());
		x.setWrite_uid(detail.getCreate_uid());
		z=cpUsersRepository.save(x);
		y.setUserid(z.getId());
		y.setCreate_date(dateFormate);
		y.setWrite_date(dateFormate);
		y.setDisplayname(detail.getDisplayname());
		y.setDob(detail.getDob());
		y.setCreate_uid(detail.getCreate_uid());
		y.setWrite_uid(detail.getCreate_uid());
		y.setMobile(detail.getMobile());
		y.setEmail(z.getUsername());
		cpUserProfileRepository.save(y);
		}
		catch(Exception e) {
			
		}
		return x;
}	
}
