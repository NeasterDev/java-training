package com.TaskList;

import java.util.ArrayList;
import java.util.Scanner;

public class Update {
	// update method to set the name of the task
	public static void update(ArrayList<TaskProperties> tasks, int id, String name) {
		// get the task at given id, and set the new task name to the given name
		tasks.get(id).setTaskName(name);
	}
	// overloaded update method that also updates if it is complete
	public static void update(ArrayList<TaskProperties> tasks, int id, String name, boolean isComplete) {
		tasks.get(id).setTaskName(name);
		tasks.get(id).setComplete(isComplete);	
	}
}
