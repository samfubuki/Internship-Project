package com.mahaadev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.mahaadev.dao.BillChargeGroupDao;
import com.mahaadev.dao.CasemasterDao;
import com.mahaadev.model.BillChargeGroup;
import com.mahaadev.model.Casemaster;

@Service
public class BillChargeGroupService {
	@Autowired
	BillChargeGroupDao billDao;
	
	public BillChargeGroup saveBillChargeGroup(BillChargeGroup billchargegroup) {
		BillChargeGroup save = billDao.save(billchargegroup);
		return save;
	}
	public List<BillChargeGroup> getBillChargeGroupForm() {
		List<BillChargeGroup> list = (List<BillChargeGroup>) billDao.findAll();
		return list;
	}
	public void deleteUser(Integer id) {
		billDao.deleteById(id);
	}
	public BillChargeGroup getUserById(Integer id) {
		Optional<BillChargeGroup> findById = billDao.findById(id);
		BillChargeGroup reg = findById.get();
		return reg;
	}

	public BillChargeGroup updateBillChargeGroup(BillChargeGroup billchargegroup) {
		BillChargeGroup save = billDao.save(billchargegroup);
		return save;
	}

}
