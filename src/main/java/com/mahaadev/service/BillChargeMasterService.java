package com.mahaadev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mahaadev.dao.BillChargeMasterDao;
import com.mahaadev.model.BillChargeMaster;

@Service
public class BillChargeMasterService {
	@Autowired
	BillChargeMasterDao billmDao;
	
	public BillChargeMaster saveBillChargeMaster(BillChargeMaster billchargemaster) {
		BillChargeMaster save = billmDao.save(billchargemaster);
		return save;
	}
	public List<BillChargeMaster> getBillChargeMasterForm() {
		List<BillChargeMaster> list = (List<BillChargeMaster>) billmDao.findAll();
		return list;
	}
	public void deleteUser(Integer id) {
		billmDao.deleteById(id);
	}
	public BillChargeMaster getUserById(Integer id) {
		Optional<BillChargeMaster> findById = billmDao.findById(id);
		BillChargeMaster reg = findById.get();
		return reg;
	}

	public BillChargeMaster updateBillChargeMaster(BillChargeMaster billchargemaster) {
		BillChargeMaster save = billmDao.save(billchargemaster);
		return save;
	}
}
