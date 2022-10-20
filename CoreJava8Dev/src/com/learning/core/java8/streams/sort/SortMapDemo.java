package com.learning.core.java8.streams.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.learning.core.java8.lamda.example.one.User;

public class SortMapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(2, "two");
		map.put(7, "seven");
		map.put(3, "three");
		map.put(10, "ten");
		
		List<Entry<Integer,String>> entries = new ArrayList<Entry<Integer,String>>(map.entrySet());
		
//		System.out.println("Java 7 Approach:");
//		Collections.sort(entries, new Comparator<Entry<Integer,String>>() {
//			@Override
//			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
//				return o1.getKey().compareTo(o2.getKey());
//			}
//		});
//
//
//		for (Iterator iterator = entries.iterator(); iterator.hasNext();) {
//			Entry<Integer, String> entry = (Entry<Integer, String>) iterator.next();
//			System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
//		}
		
		System.out.println("Java 8 lambda approach:");
		Collections.sort(entries, (e1,e2) -> e1.getKey().compareTo(e2.getKey()));
		for (Iterator iterator = entries.iterator(); iterator.hasNext();) {
			Entry<Integer, String> entry = (Entry<Integer, String>) iterator.next();
			System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
		}
		System.out.println("Comparing by Key:");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("Comparing by value:");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
		//Java 7 Approach
		
//		Map<User,Integer> usersMap = new TreeMap<>(new Comparator<User>() {
//
//			@Override
//			public int compare(User o1, User o2) {
//				// TODO Auto-generated method stub
//				return o1.getAge() - o2.getAge();
//			}
//			
//		});
		
		
		Map<User,Integer> usersMap = new TreeMap<>((o1,o2) -> o1.getAge() - o2.getAge());
		usersMap.put(new User("Mihir",107L,23,'M'), 4);
		usersMap.put(new User("Rohan",108L,25,'M'), 5);
		usersMap.put(new User("Taran",109L,30,'M'), 12);
		usersMap.put(new User("Sonali",110L,27,'F'), 9);    
		
		System.out.println(usersMap);

		usersMap.entrySet().stream()
				.sorted(Map.Entry
				.comparingByKey(Comparator.comparing(User::getId)))
				.forEach(System.out::println);		
		
		
		
	}

}
