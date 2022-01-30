package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.DoctorRepository;
import com.app.model.Doctor;

@Service
public class DoctorService {
	@Autowired
	private DoctorRepository doctorRepo;
	public Doctor saveDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}
	public Doctor updateDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}
	public List<Doctor> getAllDoctors() {
		return (List<Doctor>) doctorRepo.findAll();
	}
	public void deleteDoctor(int doctorid) {
		doctorRepo.deleteById(doctorid);
	}
	public Doctor findDoctorByDid(int doctorid) {
		return doctorRepo.findById(doctorid).get();
	}
}
