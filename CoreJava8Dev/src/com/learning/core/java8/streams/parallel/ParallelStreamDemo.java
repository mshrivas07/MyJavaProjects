package com.learning.core.java8.streams.parallel;

import java.util.stream.IntStream;

import com.learning.core.java8.lamda.example.one.UsersService;

public class ParallelStreamDemo {
	
	public static void main(String[] args) {
		
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		IntStream.range(1, 10000).forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Sequential stream took time:"+(end-start));
		
		System.out.println("===============================");
		
		start = System.currentTimeMillis();
		IntStream.range(1, 10000).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Parallel stream took time:"+(end-start));
		
		System.out.println("===============================");
		IntStream.range(1, 10).forEach(x-> {
			System.out.println("Thread :"+Thread.currentThread().getName()+" : "+x);
		});
		System.out.println("===============================");
		IntStream.range(1, 10).parallel().forEach(x-> {
			System.out.println("Thread :"+Thread.currentThread().getName()+" : "+x);
		});
		
		start = System.currentTimeMillis();
		Double normalStreamAvgAge = UsersService.getBulkUsers()
				.stream()
				.map(usr -> usr.getAge())
				.mapToDouble(i -> i)
				.average()
				.getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("To calculate average Sequential stream took time:"+(end-start)+" avg:"+normalStreamAvgAge);
		
		start = System.currentTimeMillis();
		Double parallelStreamAvgAge = UsersService.getBulkUsers()
				.stream()
				.map(usr -> usr.getAge())
				.mapToDouble(i -> i)
				.average()
				.getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("To calculate average Sequential stream took time:"+(end-start)+" avg:"+parallelStreamAvgAge);
	}

}
