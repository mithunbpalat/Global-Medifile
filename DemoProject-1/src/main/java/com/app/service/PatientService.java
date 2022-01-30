package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.PatientRepository;
import com.app.model.Patient;

@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepo;
	public Patient savePatient(Patient patient) {
		return patientRepo.save(patient);
	}
	public Patient updatePatient(Patient patient) {
		return patientRepo.save(patient);
	}
	public List<Patient> getAllPatients() {
		return (List<Patient>) patientRepo.findAll();
	}
	public void deletePatient(int gin) {
		patientRepo.deleteById(gin);
	}
	public Patient findPatientByGin(int gin) {
		return patientRepo.findById(gin).get();
	}
}
