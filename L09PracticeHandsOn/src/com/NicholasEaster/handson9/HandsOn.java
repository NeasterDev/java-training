package com.NicholasEaster.handson9;

import java.util.ArrayList;
import java.util.List;

public class HandsOn {

	public static void main(String[] args) {
		// create an arraylist of animals
		List<Animal> animalList = new ArrayList<Animal>();
		// create the animalFactory object to add animals to the list
		AnimalFactory animalFactory = new AnimalFactory();
		// boolean to track when the user is done inputting animals
		boolean exit = false;
		// prompt to let the user know they can type exit to quit
		System.out.println("Enter \'exit\' to quit");
		// while they haven't inputed exit
		while (!exit) {
			// prompt to enter animal name 
			System.out.print("Enter animal name:");
			// variable to store contents of input
			String input = StudentHelper.ReadInputString();
			// if they input exit (ignoring capitalization)
			if (input.equalsIgnoreCase("exit")) {
				// variables to count how many of each animal are in the array
				int dogs = 0, cats = 0, cows = 0;
				// for loop to iterate through the list of animals
				for (Animal a : animalList) {
					// If the animal is not null (the user input a correct animal)
					if (a != null) {
						// set the name of the animal to the name of the class
						a.setName(a.getClass().getSimpleName());
					}
					// checks to see what name each animal has
					// then increments the relevant counter to keep track of how many
					// of each animal is in the array
					if (a.getName().equalsIgnoreCase("dog")) { dogs++; }
					else if (a.getName().equalsIgnoreCase("cat")) { cats++; }
					else if (a.getName().equalsIgnoreCase("cow")) { cows++; }
				}
				// prints out the number of each animal that is in the array
				System.out.println(dogs + " dogs\n" + cats + " cats\n" + cows + " cows");
				// set exit to true so the loop ends
				exit = true;
			} else {
				// if the user did not input 'exit', add the animal to the animal list
				animalList.add(animalFactory.getAnimal(input));
			}
		}
	}

}
