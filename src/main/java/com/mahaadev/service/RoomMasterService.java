package com.mahaadev.service;

import com.mahaadev.model.RoomMaster;

import com.mahaadev.dao.RoomMasterDao;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class RoomMasterService {
	@Autowired
	RoomMasterDao rmDao;
	 public RoomMaster saveRoomMaster(RoomMaster roommaster) {
	 		RoomMaster save = rmDao.save(roommaster);
	 		return save;
	 	}
	 	public List<RoomMaster> getRoomMasterForm() {
	 		List<RoomMaster> list = (List<RoomMaster>) rmDao.findAll();
	 		return list;
	 	}
	 	public void deleteUser(Integer id) {
	 		rmDao.deleteById(id);
	 	}
	 	public RoomMaster getUserById(Integer id) {
	 		Optional<RoomMaster> findById = rmDao.findById(id);
	 		RoomMaster reg = findById.get();
	 		return reg;
	 	}

	 	public RoomMaster updateRoomMaster(RoomMaster roommaster) {
	 		RoomMaster save = rmDao.save(roommaster);
	 		return save;
	 	}

}
