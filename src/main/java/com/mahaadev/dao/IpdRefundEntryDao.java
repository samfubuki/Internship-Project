package com.mahaadev.dao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.mahaadev.model.IpdRefundEntry;

@Repository
public interface IpdRefundEntryDao extends CrudRepository<IpdRefundEntry, Integer>{

}
