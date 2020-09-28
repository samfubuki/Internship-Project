package com.mahaadev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mahaadev.dao.NursingStationMasterDao;

import com.mahaadev.model.NursingStationMaster;

@Service
public class NursingStationMasterService {
   @Autowired
   NursingStationMasterDao nsmDao;
   
   public NursingStationMaster saveNursingStationMaster(NursingStationMaster nursingstationmaster) {
		NursingStationMaster save = nsmDao.save(nursingstationmaster);
		return save;
	}
	public List<NursingStationMaster> getNursingStationMasterForm() {
		List<NursingStationMaster> list = (List<NursingStationMaster>) nsmDao.findAll();
		return list;
	}
	public void deleteUser(Integer id) {
		nsmDao.deleteById(id);
	}
	public NursingStationMaster getUserById(Integer id) {
		Optional<NursingStationMaster> findById = nsmDao.findById(id);
		NursingStationMaster reg = findById.get();
		return reg;
	}

	public NursingStationMaster updateNursingStationmaster(NursingStationMaster nursingstationmaster) {
		NursingStationMaster save = nsmDao.save(nursingstationmaster);
		return save;
	}

}
   

