package io.yalabs.model;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="applies_job")
public class CpAppliedJob {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "cp_jobs")
	@SequenceGenerator(name="cp_jobs", sequenceName = "cp_jobs_id_seq", allocationSize=1)
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
	public Timestamp getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public CpAppliedJob() {
		
	}
	public CpAppliedJob(BigInteger id, String title, String description, String qualification, double ctc,
			String designation, String employment_type) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.qualification = qualification;
		this.ctc = ctc;
		this.designation = designation;
		this.employment_type = employment_type;
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
}
