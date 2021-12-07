package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;
@Entity
@Table(name="book",catalog="medical_database")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gin;
	private int pid;
	private String patientname;
	private String address;
	private String hospital;
	private String doctor;
	private String specialization;
	private String phonenumber;
	private String date;
	private String city;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int gin, int pid, String patientname, String address, String hospital, String doctor,
			String specialization, String phonenumber, String date, String city) {
		super();
		this.gin = gin;
		this.pid = pid;
		this.patientname = patientname;
		this.address = address;
		this.hospital = hospital;
		this.doctor = doctor;
		this.specialization = specialization;
		this.phonenumber = phonenumber;
		this.date = date;
		this.city = city;
	}
	public int getGin() {
		return gin;
	}
	public void setGin(int gin) {
		this.gin = gin;
	}
	public int getPId() {
		return pid;
	}
	public void setPId(int pid) {
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
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
