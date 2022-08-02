package com.bonus;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// scanner is used to get input from the user
		Scanner input = new Scanner(System.in);
		
		// known prices of magical items
		float total = 0f;
		float cauldron = 56f;
		float wand = 132f;
		float owl = 40f;
		float cat = 25f;
		float books = 86f;
		
		// checking if the cauldron is on sale
		System.out.println("Is the cauldron on sale?(true or false)");
		boolean onSale = input.nextBoolean();
		if (onSale) {
			// if the cauldron is on sale, what is the discount percent
			System.out.println("Enter discount %");
			float salePercent = input.nextFloat();
			
			// adjust the price of the cauldron based on the sale percentage
			cauldron = cauldron - (cauldron * (salePercent / 100));
		}
		
		// check if the user is purchasing a cat
		System.out.println("Are you buying a cat?");
		boolean buyCat = input.nextBoolean();
		if (buyCat) {
			// if they are buying a cat, the owl is 50% off
			System.out.println("You have just won an all inclusive 50% discount on your next owl purchase!");
			owl = owl / 2;
		} else {
			cat = 0f;
		}

		// calculates the total of all magical items required
		total = cauldron + wand + owl + cat + books;
		
		System.out.println("Your total is: $" + total);
		System.out.println("\nYou go to the bank to withdraw this sum of money. The line is long but the Goblins urge you forward to the head of the counter.\n"
						 + "The goblin tells you this: He will give you the sum you require without removing it from your bank account IF you take a package\n"
						 + "to Dumbledore. In fact, he states he will give you twice what you need for your supplies.");
		
		// the amount of money the goblin is offering
		System.out.println("$" + (total * 2));
		
		// does the user accept the goblin's offer
		System.out.println("Do you agree?");
		boolean agree = input.nextBoolean();
		
		if (agree) {
			// if you accept you get twice the money you need
			total = (total * 2);
			System.out.println("Once you have taken the money, you find a beggar outside of the bank. You decide to give him 15% of your money you have left\n"
							 + "after buying supplies.");
			// update new total after giving money to beggar
			total = (total - (total * (.15f)));
			// after you give the beggar 15% of your money, you will have this amount of money
			System.out.println("You now have $" + total + " in your pocket.");
		} else {
			// this is how much you have if you decline the goblin's offer
			System.out.println("You now have $" + total + " in your pocket.");
		}
		
		// end the input state
		input.close();
	}

}
