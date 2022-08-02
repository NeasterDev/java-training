package com.methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "George";
		greetPerson(userName);
		printHelloWorld();
		System.out.println(isEven(2));
		System.out.println(add(1,2));
		
	}
	
	public static void printHelloWorld() {
		System.out.println("Hello Again, World!");
	}
	
	public static void greetPerson(String personName) {
		System.out.println("Hello " + personName);
	}
	
	public static boolean isEven(int numbers) {
		if (numbers % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

}
