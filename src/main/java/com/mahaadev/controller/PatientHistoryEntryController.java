package com.mahaadev.controller;

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

import com.mahaadev.model.PatientHistoryEntry;
import com.mahaadev.service.PatientHistoryEntryService;

@Controller
public class PatientHistoryEntryController {
	@Autowired
	PatientHistoryEntryService patienthistoryentryService;
	@RequestMapping("/patientHistoryEntryForm")
	public String patientHistoryEntryForm(Model model)
	{
		model.addAttribute("patienthistoryentry", new PatientHistoryEntry());
		return "patienthistoryentry/patientHistoryEntryForm";
	}
	@PostMapping("/savePatientHistoryEntry")
	public String savePatientHistoryEntry(@ModelAttribute("patienthistoryentry") PatientHistoryEntry patienthistoryentry, HttpServletRequest request)
	{
		PatientHistoryEntry saveRegistration = patienthistoryentryService.savePatientHistoryEntry(patienthistoryentry);
		String view = "";
		if(saveRegistration!=null)
		{
			request.setAttribute("message", "Congratulations! Your registration was successful");
			view = "success/successpatienthistoryentry";
			
		}
		else
		{
			request.setAttribute("message","Failed");
			view = "patienthistoryentry/patientHistoryEntryForm";
		}
	 return view; 	
	}
	
	@GetMapping("/getPatientHistoryEntryForm")
    public String getPatientHistoryEntryForm(HttpServletRequest request)
    {
		List<PatientHistoryEntry> patienthistoryentryForm = patienthistoryentryService.getPatientHistoryEntry();
		request.setAttribute("allPatientHistoryEntryData", patienthistoryentryForm);
		return "patienthistoryentry/getPatientHistoryEntryForm";
		
    }
	
	@DeleteMapping("/deleteUserp")
	@ResponseBody
	public String deleteUserp(@RequestParam("sno") String sno, @RequestParam("key") String key ) 
	{
		System.out.println(key);
		patienthistoryentryService.deleteUser(Integer.parseInt(sno));
		return "deleted";
	}
	
	@RequestMapping("/updateUserp")
	public String updateUserp(@RequestParam("sno") String sno, Model model)
	{
		PatientHistoryEntry pas = patienthistoryentryService.getUserById(Integer.parseInt(sno));
		model.addAttribute("patienthistoryentry", pas);
		return "patienthistoryentry/updatePatientHistoryEntryForm";
	}
	
	@RequestMapping("/updatePatientHistoryEntry")
	public String updatePatientHistoryEntry(@ModelAttribute("patienthistoryentry") PatientHistoryEntry patienthistoryentry, HttpServletRequest request)
	{
	  PatientHistoryEntry updatehistoryentry = patienthistoryentryService.updatePatientHistoryEntry(patienthistoryentry);
	  request.setAttribute("Update PatientHistoryEntry", updatehistoryentry);
	  return "redirect:/getPatientHistoryEntryForm";
	}
}
