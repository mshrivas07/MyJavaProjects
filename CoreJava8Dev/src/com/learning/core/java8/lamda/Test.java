package com.learning.core.java8.lamda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
	
	
	public static void main(String[] args) {
		
		List<Integer> arr1 = Arrays.asList(1,3,5,6,9,5);
		List<Integer> arr2 = Arrays.asList(1,4,7,9);
		
		
		List<Integer> arr3 = new ArrayList<Integer>();
		for (Iterator iterator = arr2.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if(!arr1.contains(integer)) {
				arr3.add(integer);
			}
		}
		System.out.println("Arr3:"+arr3);
		List<Integer> arr4 = new ArrayList<Integer>();
		for (Iterator iterator = arr1.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if(!arr2.contains(integer)) {
				arr4.add(integer);
			}
		}
		System.out.println("Arr4:"+arr4);
		arr4.addAll(arr3);
		System.out.println("Arr5"+arr4);
		
	}

}
