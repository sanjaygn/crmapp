package com.crmapp.services;

import java.util.List;

import com.crmapp.entities.Billing;

public interface BillingService {

	public void saveOneBill(Billing bill);

	public List<Billing> getAllBills();

}
