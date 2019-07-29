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
@Table(name="cp_user_profile")
public class CpUserProfile {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "cp_user_profile")
	@SequenceGenerator(name="cp_user_profile", sequenceName = "cp_user_profile_id_seq", allocationSize=1)
	@Column(name="id")
	private	BigInteger id;
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
	@Column(name="create_uid")
	private BigInteger create_uid;
	@Column(name="write_uid")
	private BigInteger write_uid;
	@Column(name="create_date")
	private Timestamp create_date;
	@Column(name="write_date")
	private Timestamp write_date;
	public CpUserProfile() {
		
	}
	public CpUserProfile(BigInteger id, BigInteger userid, String displayname, String email, String mobile,
			String skills, Date dob, String summary, BigInteger documentid, String linkdinurl, boolean isactive,
			BigInteger create_uid, BigInteger write_uid, Timestamp create_date, Timestamp write_date) {
		super();
		this.id = id;
		this.userid = userid;
		this.displayname = displayname;
		this.email = email;
		this.mobile = mobile;
		this.skills = skills;
		this.dob = dob;
		this.summary = summary;
		this.documentid = documentid;
		this.linkdinurl = linkdinurl;
		this.isactive = isactive;
		this.create_uid = create_uid;
		this.write_uid = write_uid;
		this.create_date = create_date;
		this.write_date = write_date;
	}
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
	public void setDisplayname(String displayid) {
		this.displayname = displayid;
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
	public BigInteger getCreate_uid() {
		return create_uid;
	}
	public void setCreate_uid(BigInteger create_uid) {
		this.create_uid = create_uid;
	}
	public BigInteger getWrite_uid() {
		return write_uid;
	}
	public void setWrite_uid(BigInteger write_uid) {
		this.write_uid = write_uid;
	}
	public Timestamp getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}
	public Timestamp getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Timestamp write_date) {
		this.write_date = write_date;
	}
	
}
