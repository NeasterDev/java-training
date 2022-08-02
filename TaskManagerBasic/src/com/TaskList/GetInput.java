package com.TaskList;

import java.util.Scanner;

public class GetInput {
	static Scanner userInput = new Scanner(System.in);
	
	// read the user input
	public static int readUserInt() {
		int result = userInput.nextInt();
		userInput.nextLine();
		return result;
	}
	
	public static String readUserString() {
		String result = userInput.nextLine();
		//userInput.nextLine();
		return result;
	}
}
