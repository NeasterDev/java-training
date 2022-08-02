package com.TaskList;

import java.util.ArrayList;

public class CompleteTask {
	// mark the task complete
	public static void completeTask(ArrayList<TaskProperties> tasks, int id) {
		tasks.get(id - 1).setComplete(true);
	}
}
