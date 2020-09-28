package com.mahaadev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mahaadev.model.Registration;

@Controller
public class RegisterController {
	
	

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/saveRegistration")
	public String registrationSaved(@ModelAttribute Registration reg) {
		
		return "registrationSaved";
	}
}

