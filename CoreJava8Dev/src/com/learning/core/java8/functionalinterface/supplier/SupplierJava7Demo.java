package com.learning.core.java8.functionalinterface.supplier;

import java.util.function.Supplier;

public class SupplierJava7Demo implements Supplier<String>{

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Hello Java 8";
	}//meaning it will return string
	
public static void main(String[] args) {
	Supplier<String> supplier = new SupplierJava7Demo();
	System.out.println(supplier.get());
}
}
