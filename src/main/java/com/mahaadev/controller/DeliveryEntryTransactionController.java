package com.mahaadev.controller;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;

import com.mahaadev.service.DeliveryEntryTransactionService;

import com.mahaadev.model.DeliveryEntryTransaction;

@Controller
public class DeliveryEntryTransactionController {
	@Autowired
	DeliveryEntryTransactionService deliveryEntryTransactionService;
	@RequestMapping("/deliveryentrytransactionForm")
	public String deliveryentrytransactionForm(Model model)
	{
		model.addAttribute("deliveryentrytransaction", new DeliveryEntryTransaction());
		return "deliveryentrytransaction/deliveryentrytransactionForm";
	}
	@PostMapping("/saveDeliveryEntryTransaction")
	public String savedeliveryentrytransaction(@ModelAttribute("deliveryentrytransaction") DeliveryEntryTransaction deliveryentrytransaction, HttpServletRequest request)
	{
		DeliveryEntryTransaction saveRegistration = deliveryEntryTransactionService.saveDeliveryEntryTransaction(deliveryentrytransaction);
		String view = "";
		if(saveRegistration!=null)
		{
			request.setAttribute("message", "Congratulations! Your registration was successful");
			view = "success/successdeliveryentrytransaction";
			
		}
		else
		{
			request.setAttribute("message","Failed");
			view = "deliveryentrytransaction/deliveryentrytransactionForm";
		}
	 return view; 	
	}
	
	@GetMapping("/getDeliveryEntryTransactionForm")
    public String getDeliveryEntryTransactionForm(HttpServletRequest request)
    {
		List<DeliveryEntryTransaction> deliveryentrytransactionForm = deliveryEntryTransactionService.getDeliveryEntryTransactionForm();
		request.setAttribute("allDeliveryEntryTransactionData", deliveryentrytransactionForm);
		return "deliveryentrytransaction/getDeliveryEntryTransactionForm";
		
    }
	
	@DeleteMapping("/deleteUserd")
	@ResponseBody
	public String deleteUserd(@RequestParam("sno") String sno, @RequestParam("key") String key ) 
	{
		System.out.println(key);
		deliveryEntryTransactionService.deleteUser(Integer.parseInt(sno));
		return "deleted";
	}
	
	@RequestMapping("/updateUserd")
	public String updateUserd(@RequestParam("sno") String sno, Model model)
	{
		DeliveryEntryTransaction das = deliveryEntryTransactionService.getUserById(Integer.parseInt(sno));
		model.addAttribute("deliveryentrytransaction", das);
		return "deliveryentrytransaction/updateDeliveryEntryTransactionForm";
	}
	
	@RequestMapping("/updateDeliveryEntryTransaction")
	public String updateDeliveryEntryTransaction(@ModelAttribute("deliveryentrytransaction") DeliveryEntryTransaction deliveryentrytransaction, HttpServletRequest request)
	{
	  DeliveryEntryTransaction updateDeliveryEntryTransaction = deliveryEntryTransactionService.updateDeliveryEntryTransaction(deliveryentrytransaction);
	  request.setAttribute("Update DeliveryEntryTransaction", updateDeliveryEntryTransaction);
	  return "redirect:/getDeliveryEntryTransactionForm";
	}
	
}	
	
	
	

