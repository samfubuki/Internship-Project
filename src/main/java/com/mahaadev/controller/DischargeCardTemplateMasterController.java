package com.mahaadev.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import com.mahaadev.service.DischargeCardTemplateMasterService;

import com.mahaadev.model.DischargeCardTemplateMaster;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DischargeCardTemplateMasterController {
@Autowired
DischargeCardTemplateMasterService dischargecardtemplatemasterService;
@RequestMapping("/dischargeCardTemplateMasterForm")
public String dischargeCardTemplateMasterForm(Model model)
{
	model.addAttribute("DischargeCardTemplateMaster", new DischargeCardTemplateMaster());
	return "dischargecardtemplatemaster/dischargeCardTemplateMasterForm";
}
@PostMapping("/saveDischargeCardTemplateMaster")
public String saveDischargeCardTemplateMaster(@ModelAttribute("DischargeCardTemplateMaster") DischargeCardTemplateMaster dischargecardtemplatemaster, HttpServletRequest request)
{
	DischargeCardTemplateMaster saveRegistration = dischargecardtemplatemasterService.saveDischargeCardTemplateMaster(dischargecardtemplatemaster);
	String view = "";
	if(saveRegistration!=null)
	{
		request.setAttribute("message","Congratulations! Your Registration was successfull");
		view = "success/successdischargemaster";
	}
	else
	{
		request.setAttribute("message","Failed");
		view = "dischargecardtemplatemaster/dischargeCardTemplateMasterForm";
	}
 return view;	
}
@GetMapping("/getDischargeCardTemplateMasterForm")
public String getDischargeCardTemplateMasterForm(HttpServletRequest request)
{
  List<DischargeCardTemplateMaster>	dischargecardtemplatemasterForm = dischargecardtemplatemasterService.getDischargeCardTemplateMaster();
  request.setAttribute("allDischargeCardTemplateMasterData", dischargecardtemplatemasterForm);
  return "dischargecardtemplatemaster/getDischargeCardTemplateMasterForm";
  
}
@DeleteMapping("/deleteUserdc")
@ResponseBody
public String deleteUserdc(@RequestParam("sno") String sno, @RequestParam("key") String key ) 
{
	System.out.println(key);
	dischargecardtemplatemasterService.deleteUser(Integer.parseInt(sno));
	return "deleted";
}
@RequestMapping("/updateUserdc")
public String updateUserdc(@RequestParam("sno") String sno, Model model)
{
	DischargeCardTemplateMaster dctm = dischargecardtemplatemasterService.getUserById(Integer.parseInt(sno));
	model.addAttribute("DischargeCardTemplateMaster", dctm);
	return "dischargecardtemplatemaster/updateDischargeCardTemplateMasterForm";
}
@RequestMapping("/updateDischargeCardTemplateMaster")
public String updateDischargeCardTemplateMaster(@ModelAttribute("DischargeCardTemplateMaster") DischargeCardTemplateMaster dischargecardtemplatemaster, HttpServletRequest request)
{
	DischargeCardTemplateMaster updatedischargecardtemplatemaster =  dischargecardtemplatemasterService.updateDischargeCardTemplateMaster(dischargecardtemplatemaster);
	request.setAttribute("Update DischargeCardTemplateMaster", updatedischargecardtemplatemaster);
	return "redirect:/getDischargeCardTemplateMasterForm";
}
}
