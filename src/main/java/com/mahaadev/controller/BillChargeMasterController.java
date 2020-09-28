package com.mahaadev.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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

import com.mahaadev.model.BillChargeMaster;
import com.mahaadev.service.BillChargeMasterService;

@Controller
public class BillChargeMasterController {
	@Autowired
	BillChargeMasterService billchargemasterService;
	
	@RequestMapping("/billchargemasterForm")
	public String billchargemasterForm(Model model) {
		model.addAttribute("BillChargeMaster", new BillChargeMaster());
		return "billchargemaster/billChargeMasterForm";
	}
	
	@PostMapping("/savebillchargemaster")
	public String savebillchargemaster(@ModelAttribute("BillChargeMaster") BillChargeMaster BillChargeMaster, HttpServletRequest request) {
		BillChargeMaster.setEnteredBy("userName");
		BillChargeMaster.setEnteredDate(new Date());
		BillChargeMaster saveRegistration = billchargemasterService.saveBillChargeMaster(BillChargeMaster);
		String view = "";
		if (saveRegistration != null) {
			request.setAttribute("message", "Congratulations! your registration was successful");
			view = "success/successBillCharge";
		} else {
			request.setAttribute("message", "Failed");
			view = "billchargemaster/billChargeMasterForm";
		}
		return view;
	}
	
	@GetMapping("/getbillchargemasterForm")
	public String getbillchargemasterForm(HttpServletRequest request) {
		List<BillChargeMaster> billchargeForm = billchargemasterService.getBillChargeMasterForm();
		request.setAttribute("allBillMasterData", billchargeForm);
		return "billchargemaster/getBillChargeMasterForm";
	}
	
	@DeleteMapping("/deleteUserbm")
	@ResponseBody
	public String deleteUserbm(@RequestParam("sno") String sno, @RequestParam("key") String key) {
		System.out.println(key);
		billchargemasterService.deleteUser(Integer.parseInt(sno));
		return "deleted";
	}
	
	@RequestMapping("/updateUserbm")
	public String updateUserbm(@RequestParam("sno") String sno, Model model) {
		BillChargeMaster bcm = billchargemasterService.getUserById(Integer.parseInt(sno));
		model.addAttribute("BillChargeMaster", bcm);
		return "billchargemaster/updateBillChargeMasterForm";
	}
	
	@RequestMapping("/updatebillchargemaster")
	public String updatebillchargemaster(@ModelAttribute("BillChargeMaster") BillChargeMaster BillChargeMaster, HttpServletRequest request) {
		BillChargeMaster updateCasemaster = billchargemasterService.updateBillChargeMaster(BillChargeMaster);
		request.setAttribute("Update BillChargeMaster", updateCasemaster);
		return "redirect:/getBillChargeMasterForm";
	}
}


