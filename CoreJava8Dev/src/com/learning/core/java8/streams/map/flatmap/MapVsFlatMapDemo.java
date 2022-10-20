package com.learning.core.java8.streams.map.flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapDemo {
	
	public static void main(String[] args) {
		List<Customer> customers = CustomerService.getAllCustomers();
		
		//Example: see how Map() works for 
		//1: Data transformation using [customer -> customer.getEmail()] i.e List<Customer> is converted to List<String>
		//2: Data  mapping using [customer.getEmail()] This mapping logic.
		//This is one-to-one mapping
		List<String> emails =  customers.stream()
				.map(customer -> customer.getEmail())
				.collect(Collectors.toList());
		
		System.out.println("Emails via Map():"+emails);
		
		//Example: see how Map() works for one to many scenario
		//1: Data transformation using [customer -> customer.getPhoneNumbers()] i.e List<Customer> is converted to List<List<String>>
		//2: Data  mapping using [customer.getPhoneNumbers()] This mapping logic.
		//This is one-to-many mapping as one customer has many phone numbers.
		List<List<String>> phoneNumbers = customers.stream()
				.map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println("Phone Numbers via Map():"+phoneNumbers);
		
		//Example: see how FlatMap() works for one to many scenario. Flat map do mapping + flattening
		//1: Data transformation using [customer -> customer.getPhoneNumbers()] i.e List<Customer> is converted to List<List<String>>
		//2: Data  mapping using [customerss.getPhoneNumbers().stream()] This mapping logic.
		//This is one-to-many mapping as one customer has many phone numbers.
		List<String> allPhoneNumbers = customers.stream()
				.flatMap(customerss -> customerss.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println("Phone Numbers via Flat Map():"+allPhoneNumbers);		
		
		
	}

}
