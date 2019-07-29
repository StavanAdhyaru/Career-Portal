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
@Table(name="cp_jobs")
public class CpJobs {
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
	
	public CpJobs() {
		
	}
	public CpJobs(BigInteger id, String title, String description, String qualification, double ctc,
			String designation, String employment_type, boolean isactive, BigInteger create_uid, BigInteger write_uid,
			Timestamp create_date, Timestamp write_date) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.qualification = qualification;
		this.ctc = ctc;
		this.designation = designation;
		this.employment_type = employment_type;
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
