package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Doctor;
import com.app.service.DoctorService;

@RestController
@CrossOrigin("*")
public class DoctorController {
	@Autowired
	private DoctorService doctorServ;
	
	@PostMapping(value="postdoctor")
	public List<Doctor> saveDoctor(@RequestBody Doctor doctor){
		System.out.println("Doctor works");
		doctorServ.saveDoctor(doctor);
		return doctorServ.getAllDoctors();
	}
	@PutMapping(value="updatedoctor")
	public List<Doctor> updateDoctor(@RequestBody Doctor doctor){
		System.out.println("Doctor update works");
		doctorServ.updateDoctor(doctor);
		return doctorServ.getAllDoctors();
	}
	@GetMapping(value="getalldoctors")
	public List<Doctor> getAllDoctor(){
		return doctorServ.getAllDoctors();
	}
	@DeleteMapping(value="deletedoctorbyid")
	public List<Doctor> deleteDoctor(@RequestParam int doctorid){
		doctorServ.deleteDoctor(doctorid);
		return  doctorServ.getAllDoctors();
	}
	@GetMapping(value="getdoctorbyid")
	public Doctor getDoctorById(@RequestParam int doctorid){
		return doctorServ.findDoctorByDid(doctorid);
	}
}
