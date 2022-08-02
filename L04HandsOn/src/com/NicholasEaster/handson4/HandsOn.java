package com.NicholasEaster.handson4;

public class HandsOn {

	public static void main(String[] args) {
		// doubled
		int val = 2;
		System.out.println("Value " + val);
		val = doubleMe(val);
		System.out.println("Doubled " + val);
		
		// quadrupled
		val = 2;
		System.out.println("Value " + val);
		val = quadrupleMe(val);
		System.out.println("Quadruple " + val);
		
		// doubleMeTimes
		val = 2;
		int count = 3;
		System.out.println("Value " + val);
		System.out.println("Times " + count);
		val = doubleMeTimes(val, count);
		System.out.println("Result " + val);
	}
	
	// double an integer and print the before and after values
	public static int doubleMe(int val) {
		return (val * 2);
	}
	
	public static int quadrupleMe(int val) {
		// quadruple value
		val = doubleMe(doubleMe(val));
		return val;
	}
	public static int doubleMeTimes(int val, int count) {
		// double value count number of times
		for (int i = 0; i < count; i++) {
			val = doubleMe(val);
		}
		
		return val;
	}
	
	
}
