package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AdminRepository;
import com.app.model.Admin;

@Service
public class AdminService {
	@Autowired
	private AdminRepository adminRepo;
	public Admin saveAdmin(Admin admin) {
		return adminRepo.save(admin);
	}
	public Admin updateAdmin(Admin admin) {
		return adminRepo.save(admin);
	}
	public List<Admin> getAllAdmins() {
		return (List<Admin>) adminRepo.findAll();
	}
	public void deleteAdmin(int aid) {
		adminRepo.deleteById(aid);
	}
	public Admin findAdminByAid(int aid) {
		return adminRepo.findById(aid).get();
	}

}
