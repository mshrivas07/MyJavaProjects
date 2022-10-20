package com.learning.core.java8.streams.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		//Java7
		list.add("Mohit");
		list.add("Bharti");
		list.add("Shanaya");
		list.add("Elsa");

		for (String string : list) {
			System.out.println(string);
		}
		
		
		//Java 8
		list.stream().forEach(s -> System.out.println(s));
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        
        map.forEach((key,value) -> System.out.println("key:"+key+" value:"+value));
        map.entrySet().stream().forEach(t -> System.out.println(t));
        
        //Filter Check an condition
        
        
        
	}

}
