package com.TaskList;

import java.util.ArrayList;

public class AddTask {
	
	// add task to task list
	public static void addTask(ArrayList<TaskProperties> tasks, String taskName) {
		tasks.add(new TaskProperties(taskName));
	}
}
