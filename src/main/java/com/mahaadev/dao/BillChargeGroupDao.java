package com.mahaadev.dao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.mahaadev.model.BillChargeGroup;

@Repository
public interface BillChargeGroupDao extends CrudRepository<BillChargeGroup, Integer>{

}
