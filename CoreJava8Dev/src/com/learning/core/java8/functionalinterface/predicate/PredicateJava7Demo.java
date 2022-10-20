package com.learning.core.java8.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateJava7Demo implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		if(t%2 == 0) {
			return true;
		}
		return false;
	}
	
public static void main(String[] args) {
	Predicate<Integer> predicate =  new PredicateJava7Demo();
	System.out.println(predicate.test(4));
	System.out.println(predicate.test(7));
}

}
