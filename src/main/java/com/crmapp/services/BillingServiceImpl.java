package com.crmapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmapp.entities.Billing;
import com.crmapp.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billRepo;
	
	@Override
	public void saveOneBill(Billing bill) {
		
		billRepo.save(bill);
	}

	@Override
	public List<Billing> getAllBills() {
		
		List<Billing> bills = billRepo.findAll();
		return bills;
	}

}
