package com.learning.core.java8.streams.map.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerService {

	public static List<Customer> getAllCustomers(){
		return Stream.of(
				new Customer(101, "Amit", "Amit.Soni@gmail.com", Arrays.asList("6478779001","6478779002"))
				,new Customer(102, "Bharti", "Bharti.Mansukh@gmail.com", Arrays.asList("6478779401","6478776002"))
				,new Customer(103, "Cyndy", "Cyndy.Crawford@gmail.com", Arrays.asList("6476579001","6478779992"))
				,new Customer(101, "Diksha", "Diksha.Vishwa@gmail.com", Arrays.asList("6478779056","6478779232"))
				)
				.collect(Collectors.toList());
	}
	

}
