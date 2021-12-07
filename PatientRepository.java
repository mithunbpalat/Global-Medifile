package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Patient;
@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
