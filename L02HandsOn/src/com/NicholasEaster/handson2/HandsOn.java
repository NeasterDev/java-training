package com.NicholasEaster.handson2;

public class HandsOn {

	public static void main(String[] args) {
		int age = 24;
		boolean isStudent = false;
		int price = 0;

		if (age >= 0) {
			// if senior citizen, pay $7
			if (age >= 65) {
				price = 7;
			// if student, pay $8
			// if child, pay $8
			} else if (isStudent || age <= 12) {
				price = 8;
			// everyone else, pay $10
			} else if (age >= 13 && age <= 64)  {
				price = 10;
			}
			System.out.println("Your ticket price is $" + price);
		} else {
			System.out.println("Invalid age...");
		}
	}
}
