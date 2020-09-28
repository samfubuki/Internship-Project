package com.mahaadev.dao;

import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

import com.mahaadev.model.NursingStationMaster;



@Repository
public interface NursingStationMasterDao extends CrudRepository<NursingStationMaster, Integer>{

}
