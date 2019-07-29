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
@Table(name="cp_job_applications")
public class CpJobApplications {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "cp_job_applications")
	@SequenceGenerator(name="cp_job_applications", sequenceName = "cp_job_applications_id_seq", allocationSize=1)
	@Column(name="id")
	private BigInteger id;
	@Column(name="userid")
	private BigInteger userid;
	@Column(name="jobid")
	private BigInteger jobid;
	@Column(name="statusid")
	private BigInteger statusid;
	@Column(name="notes")
	private String notes;
	@Column(name="create_uid")
	private BigInteger create_uid;
	@Column(name="write_uid")
	private BigInteger write_uid;
	@Column(name="create_date")
	private Timestamp create_date;
	@Column(name="write_date")
	private Timestamp write_date;
	
	public CpJobApplications() {
		
	}
	public CpJobApplications(BigInteger id, BigInteger userid, BigInteger jobid, BigInteger statusid, String notes,
			BigInteger create_uid, BigInteger write_uid, Timestamp create_date, Timestamp write_date) {
		super();
		this.id = id;
		this.userid = userid;
		this.jobid = jobid;
		this.statusid = statusid;
		this.notes = notes;
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
