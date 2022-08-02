package com.madlib;

public class madlib {
	public static void main(String[] args) {
		String noun1 = "Computer";
		String noun2 = "lemons";
		String verb1 = "Speak";
		String verb2 = "Sing";
		String partOfBody = "Hands";
		String adj1 = "Beautiful";
		String noun3 = "Trees";
		String adj2 = "Gracious";
		String adj3 = "Excited";
		String adj4 = "Angry";
		String verb3 = "Jumping";
		
		sentence1(noun1);
		sentence2(noun2);
		sentence3(verb1);
		sentence4(verb2);
		sentence5(partOfBody);
		sentence6(adj1, noun3, adj2);
		sentence7(adj3, adj4);
		sentence8(verb3);
	}
	
	public static void sentence1(String noun) {
		System.out.println("Today, every student has a computer small enough to fit into his " + noun + ".");
	}
	public static void sentence2(String noun) {
		System.out.println("He can solve any math problem by simply pushing the computer's little " + noun + ".");
	}
	public static void sentence3(String verb) {
		System.out.println("Computers can add, multiply, divide, and " + verb + ".");
	}
	public static void sentence4(String verb) {
		System.out.println("They can also " + verb + " better than a human.");
	}
	public static void sentence5(String bodyPart) {
		System.out.println("Some computers are " + bodyPart + ".");
	}
	public static void sentence6(String adj, String noun, String adj2) {
		System.out.println("Others have a " + adj + " screens that shows all kinds of " + noun + " and " + adj2 + " figures");
	}
	public static void sentence7(String adj1,  String adj2) {
		System.out.println("Even if you think computers are " + adj1 + " you have to admit they are at least " + adj2 + ".");
	}
	public static void sentence8(String verb) {
		System.out.println("You might even be " + verb + " a computer right now.");
	}
	

	
}
