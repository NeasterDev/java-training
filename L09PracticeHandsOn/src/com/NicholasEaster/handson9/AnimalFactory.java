package com.NicholasEaster.handson9;

public class AnimalFactory {
	public Animal getAnimal(String animalType) {
		if(animalType.equalsIgnoreCase("cow")) { return new Cow(); } 
		else if (animalType.equalsIgnoreCase("dog")) { return new Dog(); } 
		else if (animalType.equalsIgnoreCase("cat")) { return new Cat(); } 
		else {
			System.out.println(animalType + " is not recognized by AnimalFactory");
			return null;
		}
	}
}
