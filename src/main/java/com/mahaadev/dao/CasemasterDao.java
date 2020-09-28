package com.mahaadev.dao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.mahaadev.model.Casemaster;

@Repository
public interface CasemasterDao extends CrudRepository<Casemaster, Integer>{
	

}
