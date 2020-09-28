package com.mahaadev.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mahaadev.model.NursingStationMaster;

import com.mahaadev.service.NursingStationMasterService;

@Controller
public class NursingStationMasterController {
    
	@Autowired
	NursingStationMasterService nursingstationmasterService;
	
	@RequestMapping("/nursingstationmasterForm")
	public String billchargemasterForm(Model model) {
		model.addAttribute("NursingStationMaster", new NursingStationMaster());
		return "nursingstationmaster/nursingStationMasterForm";
	}
	
	@PostMapping("/savenursingstationmaster")
	public String savenursingstationmaster(@ModelAttribute("NursingStationMaster") NursingStationMaster NursingStationMaster, HttpServletRequest request) {
		NursingStationMaster.setEnteredBy("userName");
		NursingStationMaster.setEnteredDate(new Date());
		NursingStationMaster saveRegistration = nursingstationmasterService.saveNursingStationMaster(NursingStationMaster);
		String view = "";
		if (saveRegistration != null) {
			request.setAttribute("message", "Congratulations! your registration was successful");
			view = "success/successNursing";
		} else {
			request.setAttribute("message", "Failed");
			view = "nursingstationmaster/nursingStationMasterForm";
		}
		return view;
	}
	
	@GetMapping("/getnursingstationmasterForm")
	public String getnursingstationmasterForm(HttpServletRequest request) {
		List<NursingStationMaster> nursingstationmasterForm = nursingstationmasterService.getNursingStationMasterForm();
		request.setAttribute("allNursingStationMasterData", nursingstationmasterForm);
		return "nursingstationmaster/getNursingStationMasterForm";
	}
	
	@DeleteMapping("/deleteUsernsm")
	@ResponseBody
	public String deleteUsernsm(@RequestParam("sno") String sno, @RequestParam("key") String key) {
		System.out.println(key);
		nursingstationmasterService.deleteUser(Integer.parseInt(sno));
		return "deleted";
	}
	
	@RequestMapping("/updateUsernsm")
	public String updateUsernsm(@RequestParam("sno") String sno, Model model) {
		NursingStationMaster nsm = nursingstationmasterService.getUserById(Integer.parseInt(sno));
		model.addAttribute("NursingStationMaster", nsm);
		return "nursingstationmaster/updateNursingStationMasterForm";
	}
	
	@RequestMapping("/updatenursingstationmasterForm")
	public String updatenursingstationmasterForm(@ModelAttribute("NursingStationMaster") NursingStationMaster NursingStationMaster, HttpServletRequest request) {
		NursingStationMaster updatenursingstationmaster = nursingstationmasterService.updateNursingStationmaster(NursingStationMaster);
		request.setAttribute("Update BillChargeMaster", updatenursingstationmaster);
		return "redirect:/getNursingStationMasterForm";
	}
}
