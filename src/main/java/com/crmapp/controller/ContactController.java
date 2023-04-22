package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.entities.Contact;
import com.crmapp.entities.Lead;

import com.crmapp.services.ContactService;
import com.crmapp.services.Leadservice;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@Autowired
	private Leadservice leadService;
	
	@RequestMapping("/convertToContact")
	public String convertToContact(@RequestParam("id") long id, ModelMap model) {
		
		Lead lead = leadService.getleadBId(id);
		
		Contact contact = new Contact();
		
		contact.setId(lead.getId());
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		
		contactService.saveContact(contact);
		
		leadService.deleteLeadById(id);
		
		
		List<Contact> allContacts = contactService.getAllContacts();
		model.addAttribute("contacts", allContacts);
		return "contacts_result";
	}
	
	@RequestMapping("/listallcontacts")
	public String listAllContacts(ModelMap model) {
		
		List<Contact> allContacts = contactService.getAllContacts();
		model.addAttribute("contacts", allContacts);
		return "contacts_result";
	}
	
	@RequestMapping("/getContactById")
	public String getOneContact(@RequestParam("id") long id, ModelMap model) {
		
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}
	
	@RequestMapping("/getIdForBilling")
	public String viewBillingPage(@RequestParam("id") long id, ModelMap model) {
		
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return "billing_info";
	}
}







