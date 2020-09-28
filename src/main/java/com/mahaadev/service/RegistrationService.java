package com.mahaadev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahaadev.dao.RegistrationDao;
import com.mahaadev.model.Registration;

@Service
public class RegistrationService {

	@Autowired
	RegistrationDao regDao;

	public Registration saveRegistration(Registration reg) {
		return regDao.save(reg);
	}

}