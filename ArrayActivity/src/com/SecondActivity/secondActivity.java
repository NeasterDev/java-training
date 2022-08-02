package com.SecondActivity;

import java.util.Scanner;

public class secondActivity {

	public static void main(String[] args) {
		sortingHat();
	}

	public static void sortingHat() {
		// scanner object allows us to get user input
		Scanner input = new Scanner(System.in);
		
		// questions for the user to answer
		System.out.println("Are you ambitious? (true or false)");
		boolean ambitiousInput = input.nextBoolean();
		
		System.out.println("Are you loyal? (true or false)");
		boolean	loyalInput = input.nextBoolean();
		
		System.out.println("Are you social? (true or false)");
		boolean	socialInput = input.nextBoolean();
		
		System.out.println("Are you reckless? (true or false)");
		boolean	recklessInput = input.nextBoolean();
		
		System.out.println("Are you discriminatory? (true or false)");
		boolean	discriminatoryInput = input.nextBoolean();
		
		System.out.println("Are you hot headed? (true or false)");
		boolean	hotHeadedInput = input.nextBoolean();
		
		System.out.println("Are you arrogant? (true or false)");
		boolean	arrogantInput = input.nextBoolean();
		
		System.out.println("Are you power hungry? (true or false)");
		boolean	powerHungryInput = input.nextBoolean();
		// end user questions
		// close() 
		input.close();
		
		// initializing house with empty string
		String house = "";
		
		// determine house based on above responses
		if (ambitiousInput) {
			// must be Ravenclaw or Slytherin.
			if (socialInput || recklessInput || discriminatoryInput) {
				// they cannot be Ravenclaw.
				house = "Slytherin";
			} else {
				// they cannot be Slytherin.
				house = "Ravenclaw";
			}
		} else if (loyalInput) {
			// must be Hufflepuff or Gryffindor.
			if (hotHeadedInput || arrogantInput || powerHungryInput ) {
				// they cannot be Hufflepuff.
				house = "Gryffindor";
			} else {
				// they cannot be Gryffindor.
				house = "Hufflepuff";
			}
		} else {
			System.out.println("You don't belong in Hogwarts!!!!");
		}
		System.out.println(house);
	}
}
