package com.mahaadev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.mahaadev.model.OperationMaster;
import com.mahaadev.service.OperationMasterService;

@Controller
public class OperationMasterController {
@Autowired
 OperationMasterService operationmasterService;
	@RequestMapping("/operationMasterForm")
	public String operationMasterForm(Model model)
	{
		model.addAttribute("operationmaster", new OperationMaster());
		return "operationmaster/operationMasterForm";
	}
	@PostMapping("/saveOperationMaster")
	public String saveOperationMaster(@ModelAttribute("operationmaster") OperationMaster operationmaster, HttpServletRequest request)
	{
		OperationMaster saveRegistration = operationmasterService.saveOperationMaster(operationmaster);
		String view = "";
		if(saveRegistration!=null)
		{
			request.setAttribute("message", "Congratulations! Your registration was successful");
			view = "success/successoperationmaster";
			
		}
		else
		{
			request.setAttribute("message","Failed");
			view = "operationmaster/operationMasterForm";
		}
	 return view; 	
	}
	
	@GetMapping("/getOperationMasterForm")
	public String getOperationMasterForm(HttpServletRequest request)
	{
		List<OperationMaster> operationmasterForm = operationmasterService.getOperationMaster();
		request.setAttribute("allOperationMasterData", operationmasterForm);
		return "operationmaster/getOperationMasterForm";
		
	}
	
	@DeleteMapping("/deleteUsero")
	@ResponseBody
	public String deleteUsero(@RequestParam("sno") String sno, @RequestParam("key") String key ) 
	{
		System.out.println(key);
		operationmasterService.deleteUser(Integer.parseInt(sno));
		return "deleted";
	}
	
	@RequestMapping("/updateUsero")
	public String updateUsero(@RequestParam("sno") String sno, Model model)
	{
		OperationMaster opm = operationmasterService.getUserById(Integer.parseInt(sno));
		model.addAttribute("operationmaster", opm);
		return "operationmaster/updateOperationMasterForm";
	}
	
	@RequestMapping("/updateOperationMaster")
	public String updateOperationMaster(@ModelAttribute("operationmaster") OperationMaster operationmaster, HttpServletRequest request)
	{
	  OperationMaster updateoperationmaster = operationmasterService.updateOperationMaster(operationmaster);
	  request.setAttribute("Update OperationMaster", updateoperationmaster);
	  return "redirect:/getOperationMasterForm";
	}
	} 

