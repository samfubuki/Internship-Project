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

import com.mahaadev.model.RoomCategoryMaster;

import com.mahaadev.service.RoomCategoryMasterService;

@Controller
public class RoomCategoryMasterController {

	@Autowired
	RoomCategoryMasterService roomcategorymasterservice;
	
	@RequestMapping("/roomcategorymasterForm")
	public String roomcategorymasterForm(Model model) {
		model.addAttribute("RoomCategoryMaster", new RoomCategoryMaster());
		return "roomcategory/roomcategorymasterForm";
	}
	
	@PostMapping("/saveroomcategorymaster")
	public String saveroomcategorymaster(@ModelAttribute("RoomCategoryMaster") RoomCategoryMaster RoomCategoryMaster, HttpServletRequest request) {
		RoomCategoryMaster.setEnteredBy("userName");
		RoomCategoryMaster.setEnteredDate(new Date());
		RoomCategoryMaster saveRegistration = roomcategorymasterservice.saveRoomCategoryMaster(RoomCategoryMaster);
		String view = "";
		if (saveRegistration != null) {
			request.setAttribute("message", "Congratulations! your registration was successful");
			view = "success/successRoom";
		} else {
			request.setAttribute("message", "Failed");
			view = "roomcategory/roomcategorymasterForm";
		}
		return view;
	}
	
	@GetMapping("/getroomcategorymasterForm")
	public String getnroomcategorymasterForm(HttpServletRequest request) {
		List<RoomCategoryMaster> roomcategorymasterForm = roomcategorymasterservice.getRoomCategoryMasterForm();
		request.setAttribute("allRoomCategoryMasterData", roomcategorymasterForm);
		return "roomcategory/getroomcategorymasterForm";
	}
	
	@DeleteMapping("/deleteUserrcmno")
	@ResponseBody
	public String deleteUserrcmno(@RequestParam("sno") String sno, @RequestParam("key") String key) {
		System.out.println(key);
		roomcategorymasterservice.deleteUser(Integer.parseInt(sno));
		return "deleted";
	}
	
	@RequestMapping("/updateUserrcmno")
	public String updateUserrcmno(@RequestParam("sno") String sno, Model model) {
		RoomCategoryMaster rcm = roomcategorymasterservice.getUserById(Integer.parseInt(sno));
		model.addAttribute("RoomCategoryMaster", rcm);
		return "roomcategory/updateroomcategorymasterForm";
	}
	
	@RequestMapping("/updateroomcategoryasterForm")
	public String updateroomcategorymasterForm(@ModelAttribute("RoomCategoryMaster") RoomCategoryMaster RoomCategoryMaster, HttpServletRequest request) {
		RoomCategoryMaster updateroomcategorymaster = roomcategorymasterservice.updateRoomCategoryMaster(RoomCategoryMaster);
		request.setAttribute("Update RoomCategoryMaster", updateroomcategorymaster);
		return "redirect:/getroomcategorymasterForm";
	}
}
