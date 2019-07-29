package io.yalabs.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="last_table")
public class CpLast {
	@Id
	@Column(name="jobid")
	private BigInteger jobid;
	@Column(name="count")
	private BigInteger count;
	@Column(name="title")
	private String title;
	public BigInteger getJobid() {
		return jobid;
	}
	public void setJobid(BigInteger jobid) {
		this.jobid = jobid;
	}
	public BigInteger getCount() {
		return count;
	}
	public void setCount(BigInteger count) {
		this.count = count;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public CpLast() {
		
	}
	public CpLast(BigInteger jobid, BigInteger count, String title) {
		super();
		this.jobid = jobid;
		this.count = count;
		this.title = title;
	}
	

}
