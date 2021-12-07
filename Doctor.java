package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="doctor",catalog="medical_database")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int doctorid;
	private int id;
	private String name;
	private String specialization;
	private String address;
	private String workinghospital;
	private String gender;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int doctorid, int id, String name, String specialization, String address, String workinghospital,
			String gender) {
		super();
		this.doctorid = doctorid;
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.address = address;
		this.workinghospital = workinghospital;
		this.gender = gender;
	}
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWorkinghospital() {
		return workinghospital;
	}
	public void setWorkinghospital(String workinghospital) {
		this.workinghospital = workinghospital;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
