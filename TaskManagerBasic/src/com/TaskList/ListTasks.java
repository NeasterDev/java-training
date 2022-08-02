package com.TaskList;

import java.util.ArrayList;

public class ListTasks {
	
	// method to list all tasks to the console, takes ArrayList as parameter
	public static void listTasks(ArrayList<TaskProperties> tasks) {
		// print all tasks and top and bottom line to improve readability
		System.out.println("All Tasks");
		System.out.println("=================================");
		// loop through tasks arrayList to print each item to the console
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println("| " + (i + 1) + ". " + tasks.get(i).toString());
		}
		System.out.println("=================================\n");
	}
}
