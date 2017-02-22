package com.packt.webstore.domain;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 2284040482222162898L;
	private String name;
	private Address billingAddress;
	private String phoneNumber;
	private String customerId;
	private String firstName;
	private String lastName;
	private String address;
	private long noOfOrdersMade;
	
	public Customer() {
		super();
		this.setBillingAddress(new Address());
	}

	public Customer(String customerId, String firstName, String lastName, String name) {
		this.setCustomerId(customerId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setName(name);;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + customerId + ", name=" + firstName + " " + lastName + "]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public long getNoOfOrdersMade() {
		return noOfOrdersMade;
	}

	public void setNoOfOrdersMade(long noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
