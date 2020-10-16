package com.mahaadev.service;



import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.mahaadev.dao.DischargeCardTemplateMasterDao;

import com.mahaadev.model.DischargeCardTemplateMaster;

@Service
public class DischargeCardTemplateMasterService {
 @Autowired
 DischargeCardTemplateMasterDao dctmDao;
 
 public DischargeCardTemplateMaster saveDischargeCardTemplateMaster(DischargeCardTemplateMaster dischargecardtemplatemaster) {
		DischargeCardTemplateMaster save = dctmDao.save(dischargecardtemplatemaster);
		return save;
	}
	public List<DischargeCardTemplateMaster> getDischargeCardTemplateMaster() {
		List<DischargeCardTemplateMaster> list = (List<DischargeCardTemplateMaster>) dctmDao.findAll();
		return list;
	}
	public void deleteUser(Integer id) {
		dctmDao.deleteById(id);
	}
	public DischargeCardTemplateMaster getUserById(Integer id) {
		Optional<DischargeCardTemplateMaster> findById = dctmDao.findById(id);
		DischargeCardTemplateMaster reg = findById.get();
		return reg;
	}
	public DischargeCardTemplateMaster updateDischargeCardTemplateMaster(DischargeCardTemplateMaster dischargecardtemplatemaster) {
		DischargeCardTemplateMaster save = dctmDao.save(dischargecardtemplatemaster);
		return save;
	}

}
