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

import com.mahaadev.model.IpdRefundEntry;
import com.mahaadev.service.IpdRefundEntryService;

@Controller
public class IpdRefundEntryController {
	@Autowired
	IpdRefundEntryService ipdrefundentryService;
	
	@RequestMapping("/IpdRefundEntryForm")
	public String IpdRefundEntryForm(Model model)
	{
		model.addAttribute("ipdrefundentry", new IpdRefundEntry());
		return "ipdrefundentry/ipdrefundEntryForm";
	}
	@PostMapping("/saveIpdRefundEntry")
	public String saveIpdRefundEntry(@ModelAttribute("ipdrefundentry") IpdRefundEntry ipdrefundentry, HttpServletRequest request)
	{
        IpdRefundEntry saveRegistration = ipdrefundentryService.saveIpdRefundEntry(ipdrefundentry);
		String view = "";
		if(saveRegistration!=null)
		{
			request.setAttribute("message", "Congratulations! Your registration was successful");
			view = "success/successipdrefundentry";
			
		}
		else
		{
			request.setAttribute("message","Failed");
			view = "ipdrefundentry/ipdRefundEntryForm";
		}
	 return view; 	
	}
	
	@GetMapping("/getIpdRefundEntryForm")
    public String getIpdRefundEntryForm(HttpServletRequest request)
    {
		List<IpdRefundEntry> ipdrefundentryForm = ipdrefundentryService.getIpdRefundEntry();
		request.setAttribute("allIpdRefundEntryData", ipdrefundentryForm);
		return "ipdrefundentry/getIpdRefundEntryForm";
		
    }
	
	@DeleteMapping("/deleteUserip")
	@ResponseBody
	public String deleteUserip(@RequestParam("sno") String sno, @RequestParam("key") String key ) 
	{
		System.out.println(key);
		ipdrefundentryService.deleteUser(Integer.parseInt(sno));
		return "deleted";
	}
	
	@RequestMapping("/updateUserip")
	public String updateUserip(@RequestParam("sno") String sno, Model model)
	{
		IpdRefundEntry ire = ipdrefundentryService.getUserById(Integer.parseInt(sno));
		model.addAttribute("ipdrefundentry", ire);
		return "ipdrefundentry/updateIpdRefundEntryForm";
	}
	
	@RequestMapping("/updateIpdRefundEntry")
	public String updateIpdRefundEntry(@ModelAttribute("ipdrefundentry") IpdRefundEntry ipdrefundentry, HttpServletRequest request)
	{
	  IpdRefundEntry updaterefundentry = ipdrefundentryService.updateIpdRefundEntry(ipdrefundentry);
	  request.setAttribute("Update IpdRefundEntry", updaterefundentry);
	  return "redirect:/getIpdRefundEntryForm";
	}
}
