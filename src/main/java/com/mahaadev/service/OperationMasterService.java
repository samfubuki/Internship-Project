package com.mahaadev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mahaadev.dao.OperationMasterDao;

import com.mahaadev.model.OperationMaster;

@Service
public class OperationMasterService {
	@Autowired
	OperationMasterDao opmDao;
	
	public OperationMaster saveOperationMaster(OperationMaster operationmaster) {
		OperationMaster save = opmDao.save(operationmaster);
		return save;
	}
	public List<OperationMaster> getOperationMaster() {
		List<OperationMaster> list = (List<OperationMaster>) opmDao.findAll();
		return list;
	}
	public void deleteUser(Integer id) {
		opmDao.deleteById(id);
	}
	public OperationMaster getUserById(Integer id) {
		Optional<OperationMaster> findById = opmDao.findById(id);
		OperationMaster reg = findById.get();
		return reg;
	}
	public OperationMaster updateOperationMaster(OperationMaster operationmaster) {
		OperationMaster save = opmDao.save(operationmaster);
		return save;
	}
}
