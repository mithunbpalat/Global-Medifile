package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.HospitalRepository;
import com.app.model.Hospital;

@Service
public class HospitalService {
	@Autowired
	private HospitalRepository hospitalRepo;
	public Hospital saveHospital(Hospital hospital) {
		return hospitalRepo.save(hospital);
	}
	public Hospital updateHospital(Hospital hospital) {
		return hospitalRepo.save(hospital);
	}
	public List<Hospital> getAllHospitals() {
		return (List<Hospital>) hospitalRepo.findAll();
	}
	public void deleteHospital(int ghi) {
		hospitalRepo.deleteById(ghi);
	}
	public Hospital findHospitalByGhi(int ghi) {
		return hospitalRepo.findById(ghi).get();
	}
}
