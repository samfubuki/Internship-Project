package com.mahaadev.dao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.mahaadev.model.OperationMaster;

@Repository
public interface OperationMasterDao extends CrudRepository<OperationMaster, Integer>{

}
