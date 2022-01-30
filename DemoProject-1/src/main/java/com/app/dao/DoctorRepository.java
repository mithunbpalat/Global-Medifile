package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Doctor;
@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Integer> {

}
