package com.learning.core.java8.streams.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.learning.core.java8.lamda.example.one.User;
import com.learning.core.java8.lamda.example.one.UsersService;

public class SortListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Mohit");
		list.add("Bharti");
		list.add("Shanaya");
		list.add("Elsa");
		list.add("Moana");
		
		//Java7
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		//Java 8 using streams
		//asc
		list.stream().sorted().forEach(t -> System.out.println(t));
		//desc
		list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));

		UsersService service =  new UsersService();
		List<User> users = service.getUsers();
		
		Collections.sort(users,new MyUserComparator());
		System.out.println(users);
		
		//Using Lambda
		Collections.sort(users, (o1,o2) -> o2.getAge() - o1.getAge());
		System.out.println("Desc order using lambda:"+users);
		
		//Using streams
		System.out.println("--using sorted method--");
		users.stream().sorted((o1,o2) -> o2.getAge() - o1.getAge()).forEach(System.out::println);
		System.out.println("--using sorted method with comparing method--");
		users.stream().sorted(Comparator.comparing(usr -> usr.getAge())).forEach(System.out::println);
		System.out.println("using method reference optimization");
		users.stream().sorted(Comparator.comparing(User::getName)).forEach(System.out::println);
		
	}

}

class MyUserComparator implements Comparator<User>{
	@Override
	public int compare(User o1, User o2) {
		return o1.getAge()-o2.getAge();
	}
	
}