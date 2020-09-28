package com.mahaadev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mahaadev.dao.RoomCategoryMasterDao;
import com.mahaadev.model.RoomCategoryMaster;

@Service
public class RoomCategoryMasterService {
     @Autowired
     RoomCategoryMasterDao rcmDao;
     public RoomCategoryMaster saveRoomCategoryMaster(RoomCategoryMaster roomcategorymaster) {
 		RoomCategoryMaster save = rcmDao.save(roomcategorymaster);
 		return save;
 	}
 	public List<RoomCategoryMaster> getRoomCategoryMasterForm() {
 		List<RoomCategoryMaster> list = (List<RoomCategoryMaster>) rcmDao.findAll();
 		return list;
 	}
 	public void deleteUser(Integer id) {
 		rcmDao.deleteById(id);
 	}
 	public RoomCategoryMaster getUserById(Integer id) {
 		Optional<RoomCategoryMaster> findById = rcmDao.findById(id);
 		RoomCategoryMaster reg = findById.get();
 		return reg;
 	}

 	public RoomCategoryMaster updateRoomCategoryMaster(RoomCategoryMaster roomcategorymaster) {
 		RoomCategoryMaster save = rcmDao.save(roomcategorymaster);
 		return save;
 	}
	 
}
