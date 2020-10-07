package com.mahaadev.dao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.mahaadev.model.DeliveryEntryTransaction;

@Repository
public interface DeliveryEntryTransactionDao extends CrudRepository<DeliveryEntryTransaction, Integer>{
	
}