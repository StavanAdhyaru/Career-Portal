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
@Table(name="cp_job_status")
public class CpJobStatus {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "cp_job_status")
	@SequenceGenerator(name="cp_job_status", sequenceName = "cp_job_statuss_id_seq", allocationSize=1)
	@Column(name="id")
	private BigInteger id;
	@Column(name="status")
	private String status;
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
	
	public CpJobStatus() {
	}
	public CpJobStatus(BigInteger id, String status, boolean isactive, BigInteger create_uid, BigInteger write_uid,
			Timestamp create_date, Timestamp write_date) {
		super();
		this.id = id;
		this.status = status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
