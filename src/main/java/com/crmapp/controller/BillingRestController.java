package com.crmapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crmapp.entities.Billing;
import com.crmapp.repositories.BillingRepository;

@RestController
public class BillingRestController {

	@Autowired
	private BillingRepository billRepo;
	
	
	@GetMapping("/bill/{id}")
	public Billing getBill(@PathVariable long id) {
		
		Optional<Billing> findById = billRepo.findById(id);
		Billing bill = findById.get();
		return bill;
	}
}
