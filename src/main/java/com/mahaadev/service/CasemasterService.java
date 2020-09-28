package com.mahaadev.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mahaadev.dao.CasemasterDao;

import com.mahaadev.model.Casemaster;


@Service
public class CasemasterService {
	@Autowired
	CasemasterDao caseDao;
	
	public Casemaster saveCasemaster(Casemaster casemaster) {
		Casemaster save = caseDao.save(casemaster);
		return save;
	}
	public List<Casemaster> getCasemasterForm() {
		List<Casemaster> list = (List<Casemaster>) caseDao.findAll();
		return list;
	}
	public void deleteUser(Integer id) {
		caseDao.deleteById(id);
	}
	public Casemaster getUserById(Integer id) {
		Optional<Casemaster> findById = caseDao.findById(id);
		Casemaster reg = findById.get();
		return reg;
	}

	public Casemaster updateCasemaster(Casemaster casemaster) {
		Casemaster save = caseDao.save(casemaster);
		return save;
	}

}
