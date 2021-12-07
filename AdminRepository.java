package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Admin;
@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer>{

}
