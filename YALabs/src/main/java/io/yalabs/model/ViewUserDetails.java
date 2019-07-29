package io.yalabs.model;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="view_user_details")
public class ViewUserDetails {
	
	@Column(name="id")
	private	BigInteger id;
	@Id
	@Column(name="userid")
	private BigInteger userid;
	@Column(name="displayname")
	private String displayname;
	@Column(name="email")
	private String email;
	@Column(name="mobile")
	private String mobile;
	@Column(name="skills")
	private String skills;
	@Column(name="dob")
	private Date dob;
	@Column(name="summary")
	private String summary;
	@Column(name="documentid")
	private BigInteger documentid;
	@Column(name="linkdinurl")
	private String linkdinurl;
	@Column(name="isactive")
	private boolean isactive;
	@Column(name="isadmin")
	private boolean isadmin;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public BigInteger getUserid() {
		return userid;
	}
	public void setUserid(BigInteger userid) {
		this.userid = userid;
	}
	public String getDisplayname() {
		return displayname;
	}
	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public BigInteger getDocumentid() {
		return documentid;
	}
	public void setDocumentid(BigInteger documentid) {
		this.documentid = documentid;
	}
	public String getLinkdinurl() {
		return linkdinurl;
	}
	public void setLinkdinurl(String linkdinurl) {
		this.linkdinurl = linkdinurl;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public boolean isIsadmin() {
		return isadmin;
	}
	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}
	
}
