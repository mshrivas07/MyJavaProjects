package com.learning.core.java8.streams.map.optional;

import java.util.Arrays;
import java.util.Optional;

import com.learning.core.java8.streams.map.flatmap.Customer;
import com.learning.core.java8.streams.map.flatmap.CustomerService;

public class OptionalDemo {
	
	public static Customer getEmailOfCustomer(String email) {
		return CustomerService.getAllCustomers()
				.stream()
				.filter(customer -> customer.getEmail().equals(email))
				.findAny().orElse(new Customer());
	}
	
	public static Customer getEmailOfCustomer2(String email) throws Exception {
		return CustomerService.getAllCustomers()
				.stream()
				.filter(customer -> customer.getEmail().equals(email))
				.findAny().orElseThrow(() -> new Exception("No customer found"));
	}
	
	public static void main(String[] args) throws Exception {
		
		Customer customer1 = new Customer(1101, "Nick", null, Arrays.asList("416788643","647332562"));
		Customer customer2 = new Customer(1101, "Ram", "Ram@gmail.com", Arrays.asList("416788643","647332562"));
		
		//Three methods of creating optional
		//empty
		Optional<Customer> emptyOpt = Optional.empty();
		System.out.println("emptyOpt:"+emptyOpt);
		
		//of
		Optional<String> optOf = Optional.of(customer2.getEmail());
		System.out.println("optOf:"+optOf);
		//Use this only with non null values, if you uncomment below code it will give you npe
//		optOf = Optional.of(customer1.getEmail());
//		System.out.println("optOf:"+optOf);
		
		
		//ofNullable
		//Use this when you are not sure if there will null in value.
		Optional<String> optOfNullable = Optional.ofNullable(customer1.getEmail());
		System.out.println("optOfNullable:"+optOfNullable);
		
		//get() method is used to get direct value.
		//below call will result into "main" java.util.NoSuchElementException: No value present as the value is null
//		System.out.println("optOfNullable get():"+optOfNullable.get());
		//To avoid above you can use isPresent check
		if(optOfNullable.isPresent()) {
			System.out.println("optOfNullable get():"+optOfNullable.get());
		}else {
			optOfNullable = Optional.ofNullable(customer2.getEmail());
			System.out.println("optOfNullable get():"+optOfNullable.get());
		}
		
		//OrElse
		Optional<String> optOf1 = Optional.ofNullable(customer1.getEmail());
		System.out.println("orElse for default value:"+optOf1.orElse("Default@gmail.com"));

		System.out.println("orElse for default value:"+optOf.orElse("Default@gmail.com"));


	    //OrElseThrow can be used to throw your own exception when null value is encountered
		//Uncomment below code to check this
//		System.out.println("orElseThrow for default value:"+optOf1.orElseThrow(() -> new IllegalArgumentException("Email value Not found")));
	
		System.out.println("orElseGet for default value:"+optOf1.map(String::toUpperCase).orElseGet( () -> "Default email"));
		System.out.println("orElseGet for default value:"+optOf.map(String::toUpperCase).orElseGet( () -> "Default email"));
		
		
		System.out.println("optional use:"+getEmailOfCustomer("abc"));
		System.out.println("optional use:"+getEmailOfCustomer2("abc"));
	
	}

}
