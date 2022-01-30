package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Hospital;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Integer>{

}
