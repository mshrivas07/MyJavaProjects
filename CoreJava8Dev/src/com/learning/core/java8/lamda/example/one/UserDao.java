package com.learning.core.java8.lamda.example.one;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	public List<User> getUsers(){
		List<User> users = new ArrayList<>();
		users.add(new User("Arman",101L,35,'M'));
		users.add(new User("Zakir",102L,37,'M'));
		users.add(new User("Jyoti",103L,30,'F'));
		users.add(new User("Rubina",104L,38,'F'));
		users.add(new User("Tara",105L,24,'F'));
		users.add(new User("Yash",106L,45,'M'));
		users.add(new User("Vaani",107L,25,'F'));
		return users;
	}

}
