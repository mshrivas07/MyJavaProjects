package com.learning.core.java8.streams.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Mohit");
		list.add("Bharti");
		list.add("Shanaya");
		list.add("Elsa");
		list.add("Moana");

		for (String string : list) {
			System.out.println(string);
		}

		//Stream<String> java.util.stream.Stream.filter(Predicate<? super String> predicate)
		list.stream().filter(t -> t.startsWith("M")).forEach(t -> System.out.println(t));
		
		//Filter in map 
		Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        //checking for only even keys.
        map.entrySet().stream().filter(t -> t.getKey()%2 == 0).forEach(t -> System.out.println(t));
        
        
        
        
	}

}
