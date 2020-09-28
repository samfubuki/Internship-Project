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

import com.mahaadev.model.BillChargeGroup;
import com.mahaadev.service.BillChargeGroupService;

@Controller
public class BillChargeGroupController {
		
		@Autowired
		BillChargeGroupService billchargegroupService;
		
		@RequestMapping("/billchargegroupForm")
		public String billchargegroupForm(Model model) {
			model.addAttribute("BillChargeGroup", new BillChargeGroup());
			return "billchargegroup/billChargeGroupForm";
		}
		
		@PostMapping("/savebillchargegroup")
		public String savebillchargegroup(@ModelAttribute("BillChargeGroup") BillChargeGroup BillChargeGroup, HttpServletRequest request) {
			BillChargeGroup.setEnteredBy("userName");
			BillChargeGroup.setEnteredDate(new Date());
			BillChargeGroup saveRegistration = billchargegroupService.saveBillChargeGroup(BillChargeGroup);
			String view = "";
			if (saveRegistration != null) {
				request.setAttribute("message", "Congratulations! your registration was successful");
				view = "success/successBill";
			} else {
				request.setAttribute("message", "Failed");
				view = "billchargegroup/billChargeGroupForm";
			}
			return view;
		}
		
		@GetMapping("/getbillchargegroupForm")
		public String getbillchargegroupForm(HttpServletRequest request) {
			List<BillChargeGroup> billgroupForm = billchargegroupService.getBillChargeGroupForm();
			request.setAttribute("allBillGroupData", billgroupForm);
			return "billchargeGroup/getBillChargeGroupForm";
		}
		
		@DeleteMapping("/deleteUserb")
		@ResponseBody
		public String deleteUserb(@RequestParam("sno") String sno, @RequestParam("key") String key) {
			System.out.println(key);
			billchargegroupService.deleteUser(Integer.parseInt(sno));
			return "deleted";
		}
		
		@RequestMapping("/updateUserb")
		public String updateUserb(@RequestParam("sno") String sno, Model model) {
			BillChargeGroup bcg = billchargegroupService.getUserById(Integer.parseInt(sno));
			model.addAttribute("BillChargeGroup", bcg);
			return "billchargeGroup/updateBillChargeGroupform";
		}
		
		@RequestMapping("/updatebillchargegroup")
		public String updatebillchargegroup(@ModelAttribute("BillChargeGroup") BillChargeGroup BillChargeGroup, HttpServletRequest request) {
			BillChargeGroup updatebillchargegroup = billchargegroupService.updateBillChargeGroup(BillChargeGroup);
			request.setAttribute("Update BillChargeGroup", updatebillchargegroup);
			return "redirect:/billchargegroup/getBillChargeGroupForm";
		}
	}
	

