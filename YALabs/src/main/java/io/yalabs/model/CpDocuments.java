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
@Table(name="cp_documents")
public class CpDocuments {
	//Column names 
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "cp_documents")
	@SequenceGenerator(name="cp_documents", sequenceName = "cp_documents_id_seq", allocationSize=1)
	@Column(name="id")
	private BigInteger id;
	@Column(name="filetype")
	private String filetype;
	@Column(name="filename")
	private String filename;
	@Column(name="filepath")
	private String filepath;
	@Column(name="length")
	private int length;
	@Column(name="create_uid")
	private BigInteger create_uid;
	@Column(name="write_uid")
	private BigInteger write_uid;
	@Column(name="create_date")
	private Timestamp create_date;
	@Column(name="write_date")
	private Timestamp write_date;
	
	public CpDocuments() {
		
	}
	public CpDocuments(BigInteger id, String filetype, String filename, String filepath, int length,
			BigInteger create_uid, BigInteger write_uid, Timestamp create_date, Timestamp write_date) {
		super();
		this.id = id;
		this.filetype = filetype;
		this.filename = filename;
		this.filepath = filepath;
		this.length = length;
		this.create_uid = create_uid;
		this.write_uid = write_uid;
		this.create_date = create_date;
		this.write_date = write_date;
	}
	//Getters and Setters of the column variables.
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getFilEtype() {
		return filetype;
	}
	public void setFilEtype(String filetype) {
		this.filetype = filetype;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
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
