package com.mahaadev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mahaadev.dao.DeliveryEntryTransactionDao;
import com.mahaadev.model.DeliveryEntryTransaction;

@Service
public class DeliveryEntryTransactionService {
	@Autowired
	DeliveryEntryTransactionDao detDao;
	
	public DeliveryEntryTransaction saveDeliveryEntryTransaction(DeliveryEntryTransaction deliveryentrytransaction) {
		DeliveryEntryTransaction save = detDao.save(deliveryentrytransaction);
		return save;
	}
	public List<DeliveryEntryTransaction> getDeliveryEntryTransactionForm() {
		List<DeliveryEntryTransaction> list = (List<DeliveryEntryTransaction>) detDao.findAll();
		return list;
	}
	public void deleteUser(Integer id) {
		detDao.deleteById(id);
	}
	public DeliveryEntryTransaction getUserById(Integer id) {
		Optional<DeliveryEntryTransaction> findById = detDao.findById(id);
		DeliveryEntryTransaction reg = findById.get();
		return reg;
	}

	public DeliveryEntryTransaction updateDeliveryEntryTransaction(DeliveryEntryTransaction deliveryentrytransaction) {
		DeliveryEntryTransaction save = detDao.save(deliveryentrytransaction);
		return save;
	}

}
