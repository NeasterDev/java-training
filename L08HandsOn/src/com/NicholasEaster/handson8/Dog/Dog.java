package com.NicholasEaster.handson8.Dog;

import com.NicholasEaster.handson8.Mammal.Mammal;

public class Dog implements Mammal {
	public void speak() {
		System.out.println("Bark!");
	}
	
	public void run() {
		System.out.println("Dogs can run at a top speed of 45 mph!");
	}
	
	public void eat() {
		System.out.println("Dogs eat bones.");
	}
}
