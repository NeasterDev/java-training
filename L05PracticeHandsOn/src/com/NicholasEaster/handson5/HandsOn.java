package com.NicholasEaster.handson5;

import com.NicholasEaster.handson5.Person.Person;

public class HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person nicholasEaster = new Person("Nicholas", "Easter", 24);
		
		nicholasEaster.setAge(24);
		System.out.println(nicholasEaster.getFirstName());
		System.out.println(nicholasEaster.getLastName());
		System.out.println(nicholasEaster.getAge());
	}

}
