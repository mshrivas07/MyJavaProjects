package com.learning.core.java8.functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJava8Demo {

	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> (i%2 == 0);
		System.out.println(predicate.test(6));
		System.out.println(predicate.test(9));
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		list1.stream().filter(predicate).forEach(i -> System.out.println("print even:"+i));
	}
}
