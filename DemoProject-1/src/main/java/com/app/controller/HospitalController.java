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

import com.app.model.Hospital;
import com.app.service.HospitalService;

@RestController
@CrossOrigin("*")
public class HospitalController {
	@Autowired
	private HospitalService hospitalServ;
	
	@PostMapping(value="posthospital")
	public List<Hospital> saveHospital(@RequestBody Hospital hospital){
		System.out.println("Hospital works");
		hospitalServ.saveHospital(hospital);
		return hospitalServ.getAllHospitals();
	}
	@PutMapping(value="updatehospital")
	public List<Hospital> updateHospital(@RequestBody Hospital hospital){
		System.out.println("Hospital update works");
		hospitalServ.updateHospital(hospital);
		return hospitalServ.getAllHospitals();
	}
	@GetMapping(value="getallhospitals")
	public List<Hospital> getAllHospital(){
		return hospitalServ.getAllHospitals();
	}
	@DeleteMapping(value="deletehospitalbyid")
	public List<Hospital> deleteHospital(@RequestParam int ghi){
		hospitalServ.deleteHospital(ghi);
		return hospitalServ.getAllHospitals();
	}
	@GetMapping(value="gethospitalbyid")
	public Hospital getHospitalById(@RequestParam int ghi){
		return hospitalServ.findHospitalByGhi(ghi);
	}
}
