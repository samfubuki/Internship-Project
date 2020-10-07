package com.mahaadev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahaadev.dao.PatientHistoryEntryDao;
import com.mahaadev.model.PatientHistoryEntry;

@Service
public class PatientHistoryEntryService {
	@Autowired
	PatientHistoryEntryDao pheDao;
	
	public PatientHistoryEntry savePatientHistoryEntry(PatientHistoryEntry patienthistoryentry) {
		PatientHistoryEntry save = pheDao.save(patienthistoryentry);
		return save;
	}
	public List<PatientHistoryEntry> getPatientHistoryEntry() {
		List<PatientHistoryEntry> list = (List<PatientHistoryEntry>) pheDao.findAll();
		return list;
	}
	public void deleteUser(Integer id) {
		pheDao.deleteById(id);
	}
	public PatientHistoryEntry getUserById(Integer id) {
		Optional<PatientHistoryEntry> findById = pheDao.findById(id);
	    PatientHistoryEntry reg = findById.get();
		return reg;
	}

	public PatientHistoryEntry updatePatientHistoryEntry(PatientHistoryEntry patienthistoryentry) {
		PatientHistoryEntry save = pheDao.save(patienthistoryentry);
		return save;
	}

}
