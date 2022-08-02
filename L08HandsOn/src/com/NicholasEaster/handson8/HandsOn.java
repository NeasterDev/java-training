package com.NicholasEaster.handson8;

import com.NicholasEaster.handson8.Cat.Cat;
import com.NicholasEaster.handson8.Cow.Cow;
import com.NicholasEaster.handson8.Dog.Dog;
import com.NicholasEaster.handson8.Lizard.Lizard;
import com.NicholasEaster.handson8.Turtle.Turtle;

public class HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog pupper = new Dog();
		Cat catter = new Cat();
		Cow cowwer = new Cow();
		Turtle turter = new Turtle();
		Lizard lizzer = new Lizard();
		
		pupper.speak();
		catter.speak();
		cowwer.speak();
		
		pupper.run();
		catter.run();
		cowwer.run();
		
		pupper.eat();
		catter.eat();
		cowwer.eat();
		
		turter.eat();
		turter.crawl();
		
		lizzer.eat();
		lizzer.crawl();
		
	}

}
