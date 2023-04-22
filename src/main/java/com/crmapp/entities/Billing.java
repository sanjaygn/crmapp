package com.crmapp.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="billings")
public class Billing {

	@Id
	private long id;
	
	@Column(name="first_name", length=45, nullable=false)
	private String firstName;
	
	@Column(name="last_name", length=45)
	private String lastName;
	
	@Column(length=45, nullable=false, unique=true)
	private String email;
	
	
	@Column(length=10, nullable=false, unique=true)
	private String mobile;
	
	@Column(length=45, nullable=false)
	private String product;
	
	@Column(length=45, nullable=false)
	private String amount;
	
	@Column(name="mode_of_payment", length=45, nullable=false)
	private String modeOfPayment;
	
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
}
