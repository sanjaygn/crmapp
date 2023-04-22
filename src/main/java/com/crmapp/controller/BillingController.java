package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crmapp.entities.Billing;
import com.crmapp.services.BillingService;

@Controller
public class BillingController {

	@Autowired
	private BillingService billService;
	
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("bill") Billing bill, ModelMap model) {
		
		billService.saveOneBill(bill);
		
		model.addAttribute("msg", "Bill generated!!");
		return "billing_info";
	}
	
	@RequestMapping("/listallbills")
	public String getAllBills(ModelMap model) {
		
		List<Billing> allBills = billService.getAllBills();
		
		model.addAttribute("bills", allBills);
		return "billings_result";
	}
}









