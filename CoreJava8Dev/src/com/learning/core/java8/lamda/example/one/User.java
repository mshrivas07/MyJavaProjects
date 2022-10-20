package com.learning.core.java8.lamda.example.one;

public class User {

	private String name;
	private Long Id;
	private int age;
	private char gender;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, Long id, int age, char gender) {
		super();
		this.name = name;
		Id = id;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", Id=" + Id + ", age=" + age + ", gender=" + gender + "]";
	}

}
