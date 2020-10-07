package com.mahaadev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mahaadev.dao.IpdRefundEntryDao;
import com.mahaadev.model.IpdRefundEntry;

@Service
public class IpdRefundEntryService {

	@Autowired
	IpdRefundEntryDao ireDao;
	
	public IpdRefundEntry saveIpdRefundEntry(IpdRefundEntry ipdrefundentry) {
		IpdRefundEntry save= ireDao.save(ipdrefundentry);
		return save;
	}
	public List<IpdRefundEntry> getIpdRefundEntry() {
		List<IpdRefundEntry> list = (List<IpdRefundEntry>) ireDao.findAll();
		return list;
	}
	public void deleteUser(Integer id) {
		ireDao.deleteById(id);
	}
	public IpdRefundEntry getUserById(Integer id) {
		Optional<IpdRefundEntry> findById = ireDao.findById(id);
		IpdRefundEntry reg = findById.get();
		return reg;
	}

	public IpdRefundEntry updateIpdRefundEntry(IpdRefundEntry ipdrefundentry) {
		IpdRefundEntry save = ireDao.save(ipdrefundentry);
		return save;
	}

}
