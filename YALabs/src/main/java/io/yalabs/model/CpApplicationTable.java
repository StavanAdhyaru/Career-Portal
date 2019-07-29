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
@Table(name="applicationtable")
public class CpApplicationTable {
	@Column(name="id")
	private BigInteger id;
	@Column(name="title")
	private String title;
	@Column(name="description")
	private String description;
	@Column(name="qualification")
	private String qualification;
	@Column(name="ctc")
	private double ctc;
	@Column(name="designation")
	private String designation;
	@Column(name="employment_type")
	private String employment_type;
	@Column(name="userid")
	private BigInteger userid;
	@Column(name="jobid")
	private BigInteger jobid;
	@Column(name="statusid")
	private BigInteger statusid;
	@Column(name = "notes")
	private String notes;
	@Column(name="create_date")
	private Timestamp create_date;

	@Id
	@Column(name="uid")
	private BigInteger uid;
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
	@Column(name="linkdinurl")
	private String linkdinurl;
	public Timestamp getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmployment_type() {
		return employment_type;
	}
	public void setEmployment_type(String employment_type) {
		this.employment_type = employment_type;
	}
	public BigInteger getUserid() {
		return userid;
	}
	public void setUserid(BigInteger userid) {
		this.userid = userid;
	}
	public BigInteger getJobid() {
		return jobid;
	}
	public void setJobid(BigInteger jobid) {
		this.jobid = jobid;
	}
	public BigInteger getStatusid() {
		return statusid;
	}
	public void setStatusid(BigInteger statusid) {
		this.statusid = statusid;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public BigInteger getUid() {
		return uid;
	}
	public void setUid(BigInteger uid) {
		this.uid = uid;
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
	public String getLinkdinurl() {
		return linkdinurl;
	}
	public void setLinkdinurl(String linkdinurl) {
		this.linkdinurl = linkdinurl;
	}
	public CpApplicationTable() {
		
	}
	public CpApplicationTable(BigInteger id, String title, String description, String qualification, double ctc,
			String designation, String employment_type, BigInteger userid, BigInteger jobid, BigInteger statusid,
			String notes, BigInteger uid, String displayname, String email, String mobile, String skills, Date dob,
			String linkdinurl) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.qualification = qualification;
		this.ctc = ctc;
		this.designation = designation;
		this.employment_type = employment_type;
		this.userid = userid;
		this.jobid = jobid;
		this.statusid = statusid;
		this.notes = notes;
		this.uid = uid;
		this.displayname = displayname;
		this.email = email;
		this.mobile = mobile;
		this.skills = skills;
		this.dob = dob;
		this.linkdinurl = linkdinurl;
	}
}
