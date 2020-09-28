package com.mahaadev.dao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.mahaadev.model.BillChargeMaster;




@Repository
public interface BillChargeMasterDao extends CrudRepository<BillChargeMaster, Integer>{

}
