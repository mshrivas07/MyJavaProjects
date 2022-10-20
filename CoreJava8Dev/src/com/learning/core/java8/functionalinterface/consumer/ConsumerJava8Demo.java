package com.learning.core.java8.functionalinterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerJava8Demo {
	
	public static void main(String[] args) {
		Consumer<Integer> consumer = i -> System.out.println("print:"+i);
		consumer.accept(18);
		
		//Example
		List<Integer> list1 =  Arrays.asList(1,2,3,4,5,6);
		
		list1.stream().forEach(consumer);
		
		//Also you can write consumer inside of stream
		
		list1.stream().forEach(i -> System.out.println("printing:"+(i*2)));
		
	}

}
