package com.learning.core.java8.streams.map.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.learning.core.java8.lamda.example.one.UsersService;

public class MapReduceExample {
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		//Java 7 way
		int sum = 0;
		for (Integer integer : numbers) {
			sum = sum+integer;
		}
		
		System.out.println("Sum:"+sum);
		
		//Java 8 parallel processing way
		int sum1 =  numbers.stream().mapToInt(i -> i).sum();
		System.out.println("sum java 8:"+sum1);
		
		int reduceSum = numbers.stream().reduce(0,(a,b)-> a+b);
		System.out.println("Reduced sum:"+reduceSum);
		
		Optional<Integer> reduceWithMdRef = numbers.stream().reduce(Integer::sum);  
		System.out.println("Reduce with functional reference:"+reduceWithMdRef.get());
		
		//main thing is accumulator
		Integer maxValue = numbers.stream().reduce(0, (a,b) -> a>b?a:b);
		System.out.println("maxValue:"+maxValue);
		
		List<String> words = Arrays.asList("Java","Spring","Hibernate","Microservices");
		
		String longestStr = words.stream()
				.reduce((w1,w2) -> w1.length() > w2.length() ? w1 : w2)
				.get();
		System.out.println("Longest String:"+longestStr);
		  
		
		//Example of filter all female users and their average age
		UsersService userServ = new UsersService();
		Double avgAge = userServ.getUsers().stream()
				.filter(usr -> usr.getGender() == 'F')
				.map(usr -> usr.getAge())
				.mapToInt(age -> age)
				.average().getAsDouble();
		
		System.out.println("Average female age:"+avgAge);
	}

}
