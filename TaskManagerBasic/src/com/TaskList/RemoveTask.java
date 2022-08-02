package com.TaskList;

import java.util.ArrayList;

public class RemoveTask {
	// remove task from task list
	public static void removeTask(ArrayList<TaskProperties> tasks, int id) {
		tasks.remove(id - 1);
	}
}
