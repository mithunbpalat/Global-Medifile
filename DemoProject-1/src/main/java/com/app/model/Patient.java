package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name="patient",catalog="medical_database")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gin;
	private int pid;
	private String patientname;
	private String address;
	private String hospitaladmitted;
	private String disease;
	private String relativename;
	private String relativephonenumber;
	private String dateadmitted;
	private String currentstatus;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int gin, int pid, String patientname, String address, String hospitaladmitted, String disease,
			String relativename, String relativephonenumber, String dateadmitted, String currentstatus) {
		super();
		this.gin = gin;
		this.pid = pid;
		this.patientname = patientname;
		this.address = address;
		this.hospitaladmitted = hospitaladmitted;
		this.disease = disease;
		this.relativename = relativename;
		this.relativephonenumber = relativephonenumber;
		this.dateadmitted = dateadmitted;
		this.currentstatus = currentstatus;
	}
	public int getGin() {
		return gin;
	}
	public void setGin(int gin) {
		this.gin = gin;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHospitaladmitted() {
		return hospitaladmitted;
	}
	public void setHospitaladmitted(String hospitaladmitted) {
		this.hospitaladmitted = hospitaladmitted;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getRelativename() {
		return relativename;
	}
	public void setRelativename(String relativename) {
		this.relativename = relativename;
	}
	public String getRelativephonenumber() {
		return relativephonenumber;
	}
	public void setRelativephonenumber(String relativephonenumber) {
		this.relativephonenumber = relativephonenumber;
	}
	public String getDateadmitted() {
		return dateadmitted;
	}
	public void setDateadmitted(String dateadmitted) {
		this.dateadmitted = dateadmitted;
	}
	public String getCurrentstatus() {
		return currentstatus;
	}
	public void setCurrentstatus(String currentstatus) {
		this.currentstatus = currentstatus;
	}
}
