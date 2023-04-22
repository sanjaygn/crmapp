package com.crmapp.services;

import java.util.List;

import com.crmapp.entities.Lead;



public interface Leadservice {

	public void saveLead(Lead lead);

	public List<Lead> getAllLeads();

	public Lead getleadBId(long id);

	public void deleteLeadById(long id);

}
