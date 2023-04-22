package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.entities.Lead;
import com.crmapp.services.Leadservice;

@Controller
public class LeadController {

	@Autowired
	private Leadservice leadService;
	
	@RequestMapping("/viewleadpage")
	public String viewLeadpage() {
		
		return "save_lead";
	}
	
	@RequestMapping("/savelead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/listall")
	public String getAllLeads(ModelMap model) {
		
		List<Lead> allLeads = leadService.getAllLeads();
		model.addAttribute("leads", allLeads);
		return "leads_result";
	}
	
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id, ModelMap model) {
		
		Lead lead = leadService.getleadBId(id);
		
		model.addAttribute("lead", lead);
		return "lead_info";
	}
}









