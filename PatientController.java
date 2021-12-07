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

import com.app.model.Patient;
import com.app.service.PatientService;

@RestController
@CrossOrigin("*")
public class PatientController {
	@Autowired
	private PatientService patientServ;
	
	@PostMapping(value="postpatient")
	public List<Patient> savePatient(@RequestBody Patient patient){
		System.out.println("Patient works");
		patientServ.savePatient(patient);
		return patientServ.getAllPatients();
	}
	@PutMapping(value="updatepatient")
	public List<Patient> updatePatient(@RequestBody Patient patient){
		System.out.println("Patient update works");
		patientServ.updatePatient(patient);
		return patientServ.getAllPatients();
	}
	@GetMapping(value="getallpatients")
	public List<Patient> getAllPatient(){
		return patientServ.getAllPatients();
	}
	@DeleteMapping(value="deletepatientbyid")
	public List<Patient> deletePatient(@RequestParam int gin){
		patientServ.deletePatient(gin);
		return patientServ.getAllPatients();
	}
	@GetMapping(value="getpatientbyid")
	public Patient getPatientById(@RequestParam int gin){
		return patientServ.findPatientByGin(gin);
	}
}
