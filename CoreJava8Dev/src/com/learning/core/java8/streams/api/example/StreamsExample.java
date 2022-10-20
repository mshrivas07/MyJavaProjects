package com.learning.core.java8.streams.api.example;
import java.util.List;
import java.util.stream.Collectors;

import com.learning.core.java8.lamda.example.one.User;
import com.learning.core.java8.lamda.example.one.UsersService;
public class StreamsExample {
	
	public static void main(String[] args) {
		System.out.println(getCholestrolEligible("gender"));
		System.out.println(getCholestrolEligible("age"));
		
	}
	
	public static List<User> getCholestrolEligible(String criteria){
		UsersService service = new UsersService();
		List<User> users = service.getSortedUsers();
		if(criteria == "age") {
			return users.stream().filter(usr -> usr.getAge()>35).collect(Collectors.toList());
	    }else {
			return users.stream().filter(usr -> usr.getGender()=='F').collect(Collectors.toList());
		
	    }

}
}
