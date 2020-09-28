package com.mahaadev.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
//I want you to show me the implementation of any one of the dropdown data types. If you can show OB for casemaster
//jsp dikhao kaha pe hai dropdown
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;

import com.mahaadev.service.CasemasterService;
import com.mahaadev.dao.CasemasterDao;
import com.mahaadev.model.Casemaster;

@Controller
public class CasemasterController {

	@Autowired
    CasemasterService casemasterService;

	//@Autowired
	//private CasemasterDao casemasterDao;

	@RequestMapping("/casemasterForm")
	public String casemasterForm(Model model) {
		//request.setAttribute("test", casemasterDao.findAll());
		model.addAttribute("casemaster", new Casemaster());
		return "casemaster/casemasterForm";
	}

	@PostMapping("/saveCasemaster")
	public String saveCasemaster(@ModelAttribute("casemaster") Casemaster casemaster, HttpServletRequest request) {
		casemaster.setEnteredBy("userName");
		casemaster.setEnteredDate(new Date());
		Casemaster saveRegistration = casemasterService.saveCasemaster(casemaster);
		String view = "";
		if (saveRegistration != null) {
			request.setAttribute("message", "Congratulations! your registration was successful");
			view = "success/success";
		} else {
			request.setAttribute("message", "Failed");
			view = "casemaster/casemasterForm";
		}
		return view;
	}

	@GetMapping("/getCasemasterForm")
	public String getCasemasterForm(HttpServletRequest request) {
		List<Casemaster> casemasterForm = casemasterService.getCasemasterForm();
		request.setAttribute("allCasemasterData", casemasterForm);
		return "casemaster/getCasemasterForm";
	}

	@DeleteMapping("/deleteUserc")
	@ResponseBody
	public String deleteUserc(@RequestParam("sno") String sno, @RequestParam("key") String key) {
		System.out.println(key);
		casemasterService.deleteUser(Integer.parseInt(sno));
		return "deleted";
	}

	@RequestMapping("/updateUserc")
	public String updateUserc(@RequestParam("sno") String cno, Model model) {
		Casemaster cas = casemasterService.getUserById(Integer.parseInt(cno));
		model.addAttribute("casemaster", cas);
		return "casemaster/updateCasemasterForm";
	}

	@RequestMapping("/updateCasemaster")
	public String updateCasemaster(@ModelAttribute("casemaster") Casemaster casemaster, HttpServletRequest request) {
		Casemaster updateCasemaster = casemasterService.updateCasemaster(casemaster);
		request.setAttribute("Update Casemaster", updateCasemaster);
		return "redirect:/getCasemasterForm";
	}
}
