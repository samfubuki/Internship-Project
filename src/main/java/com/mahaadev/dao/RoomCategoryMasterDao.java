package com.mahaadev.dao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.mahaadev.model.RoomCategoryMaster;

@Repository
public interface RoomCategoryMasterDao extends CrudRepository<RoomCategoryMaster, Integer>{

}
