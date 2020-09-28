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
import com.mahaadev.model.RoomMaster;

import com.mahaadev.service.RoomMasterService;

@Controller
public class RoomMasterController {
     
	 @Autowired
	 RoomMasterService roommasterservice;
	 @RequestMapping("/roommasterForm")
		public String roommasterForm(Model model) {
			model.addAttribute("RoomMaster", new RoomMaster());
			return "roommaster/RoomMasterForm";
		}
		
		@PostMapping("/saveroommaster")
		public String saveroommaster(@ModelAttribute("RoomMaster") RoomMaster RoomMaster, HttpServletRequest request) {
			RoomMaster.setEnteredBy("userName");
			RoomMaster.setEnteredDate(new Date());
			RoomMaster saveRegistration = roommasterservice.saveRoomMaster(RoomMaster);
			String view = "";
			if (saveRegistration != null) {
				request.setAttribute("message", "Congratulations! your registration was successful");
				view = "success/successMaster";
			} else {
				request.setAttribute("message", "Failed");
				view = "roommaster/roommasterForm";
			}
			return view;
		}
		
		@GetMapping("/getroommasterForm")
		public String getroommasterForm(HttpServletRequest request) {
			List<RoomMaster> roommasterForm = roommasterservice.getRoomMasterForm();
			request.setAttribute("allRoomMasterData", roommasterForm);
			return "roommaster/getRoomMasterForm";
		}
		
		@DeleteMapping("/deleteUserrmno")
		@ResponseBody
		public String deleteUserrmno(@RequestParam("sno") String sno, @RequestParam("key") String key) {
			System.out.println(key);
			roommasterservice.deleteUser(Integer.parseInt(sno));
			return "deleted";
		}
		
		@RequestMapping("/updateUserrmno")
		public String updateUserrmno(@RequestParam("sno") String sno, Model model) {
			RoomMaster rm = roommasterservice.getUserById(Integer.parseInt(sno));
			model.addAttribute("RoomMaster", rm);
			return "roommaster/updateRoomMasterForm";
		}
		
		@RequestMapping("/updateroommasterForm")
		public String updateroommasterForm(@ModelAttribute("RoomMaster") RoomMaster RoomMaster, HttpServletRequest request) {
			RoomMaster updateroommaster = roommasterservice.updateRoomMaster(RoomMaster);
			request.setAttribute("Update RoomMaster", updateroommaster);
			return "redirect:/getroommasterForm";
		}
}
