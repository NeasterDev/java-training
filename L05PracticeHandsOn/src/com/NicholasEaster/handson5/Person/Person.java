package com.NicholasEaster.handson5.Person;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {
		firstName = "";
		lastName = "";
		age = 0;
	}
	
	// overloaded constructors
	public Person(String firstName) {
		this.firstName = firstName;
		lastName = "";
		age = 0;
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		age = 0;
	}
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	// getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			this.age = 0;
			System.out.println("Attempted to set age to an invalid value. Setting age to 0 instead.");
		}

	}
	
	
}
