package com.mahaadev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mahaadev.model.Registration;

@Repository
public interface RegistrationDao extends CrudRepository<Registration, Integer>{

}
