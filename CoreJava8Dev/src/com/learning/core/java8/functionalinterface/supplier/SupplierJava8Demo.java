package com.learning.core.java8.functionalinterface.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierJava8Demo {
	
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hello Java 8";
		System.out.println(supplier.get());
		
		
		//Its used below return some value back in case nothing is returned
		Supplier<String> supplier1 = () -> "No Elements found";
		List<String> list1 = Arrays.asList("a","b");
		
		System.out.println(list1.stream().findAny().orElseGet(supplier1));
		
		List<String> list2 = Arrays.asList();
		
		System.out.println(list2.stream().findAny().orElseGet(supplier1));
	}

}
