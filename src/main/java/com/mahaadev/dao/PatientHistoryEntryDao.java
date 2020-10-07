package com.mahaadev.dao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.mahaadev.model.PatientHistoryEntry;


public interface PatientHistoryEntryDao extends CrudRepository<PatientHistoryEntry, Integer>{
  
}
