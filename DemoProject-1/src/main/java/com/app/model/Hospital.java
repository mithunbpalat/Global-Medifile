package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="hospital",catalog="medical_database")
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ghi;
	private int id;
	private String hospitalname;
	private String username;
	private String password;
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hospital(int ghi, int id, String hospitalname, String username, String password) {
		super();
		this.ghi = ghi;
		this.id = id;
		this.hospitalname = hospitalname;
		this.username = username;
		this.password = password;
	}
	public int getGhi() {
		return ghi;
	}
	public void setGhi(int ghi) {
		this.ghi = ghi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHospitalname() {
		return hospitalname;
	}
	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
