package io.yalabs.model;

import java.math.BigInteger;
import java.sql.Date;

public class CreateUserModel {
	private String displayname;
	private Date dob;
	private String username;
	private String Password;
	private String mobile; 
	private BigInteger create_uid;
	public BigInteger getCreate_uid() {
		return create_uid;
	}
	public void setCreate_uid(BigInteger create_uid) {
		this.create_uid = create_uid;
	}
	public String getDisplayname() {
		return displayname;
	}
	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
