package com.learning.core.java8.lamda.example.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import com.learning.core.java8.streams.map.flatmap.Customer;
//Approach with normal Java 7
public class UsersService {
	
	public List<User> getUsers() {
		List<User> users = new UserDao().getUsers();
		return users;
	}
	
	//Java 7 way
	public List<User> getSortedUsers() {
		List<User> users = new UserDao().getUsers();
		Collections.sort(users,new MyComparator());
		return users;
	}
	
	//Java 8 Lambda
	public List<User> getLamdaSortedUsers() {
		List<User> users = new UserDao().getUsers();
		Collections.sort(users,(o1, o2) -> o1.getName().compareTo(o2.getName()));
		return users;
	}
	//Java 8 Lambda Reverse
	public List<User> getLamdaReverseSortedUsers() {
		List<User> users = new UserDao().getUsers();
		Collections.sort(users,(o1, o2) -> o2.getName().compareTo(o1.getName()));
		return users;
	}
	
	public static List<User> getBulkUsers(){
		List<User> users = new ArrayList<User>();
		Random r = new Random();
		for(int i=0;i<=1000;i++) {
			users.add(new User("User"+i, Long.valueOf(i), r.nextInt(99), 'F'));
		}
		return users;
	}
	
	public static void main(String[] args) {
		//Java 7 comparator
		System.out.println(new UsersService().getSortedUsers());
		//Java 8 Lambda
		System.out.println(new UsersService().getLamdaSortedUsers());
		System.out.println(new UsersService().getLamdaReverseSortedUsers());
	}

}

class MyComparator implements Comparator<User>{
	public int compare(User user1, User user2) {
		return user1.getName().compareTo(user2.getName());
	}
}
