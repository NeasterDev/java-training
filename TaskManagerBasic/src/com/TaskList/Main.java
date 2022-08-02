package com.TaskList;

import java.util.ArrayList;


public class Main {
	// static variables have to be declared at the class level
	// main method 
	public static void main(String[] args) throws Exception {
		// empty arrayList to store tasks
		ArrayList<TaskProperties> tasks = null;
		// boolean that keeps track of when program stops running
		boolean running = true;
		// attempt to load task list from file if they have used the program before
		try {
			// load tasks into tasks arrayList
			tasks = Load.load();
		} catch (Exception e) {
			// prints error message that we received to the console
			e.getMessage();
		}
		// do this code while running is true
		do {
			// display the menu
			Menu.displayMenu();
			// user input for the menu choice
			int menuChoice = GetInput.readUserInt();
			// switch statement to determine what to do based on user input
			switch(menuChoice) {
				// case for adding a task
				case 1:
					// print the prompt to the console
					System.out.print("Enter the name of the task to add: ");
					// get the name of the task to add
					String taskName = GetInput.readUserString();
					// add the task to the arrayList of tasks
					AddTask.addTask(tasks,taskName);
					// exit the switch statement
					break;
				// remove task
				case 2:
					// print all tasks to the console
					ListTasks.listTasks(tasks);
					// print the prompt to the console
					System.out.print("Which task to remove: ");
					// get the task id from user input
					int removeId = GetInput.readUserInt();
					// remove the task from taskList
					RemoveTask.removeTask(tasks,removeId);
					// exit the switch statement
					break;
				// set task to complete
				case 3:
					// print all tasks to the console
					ListTasks.listTasks(tasks);
					// prompt user for input
					System.out.print("Which task to complete: ");
					// get task id from user input
					int taskId = GetInput.readUserInt();
					// set selected task to complete
					CompleteTask.completeTask(tasks, taskId);
					// exit the switch statement
					break;
				// list all tasks
				case 4:
					// list all tasks for the user
					ListTasks.listTasks(tasks);
					// exit the switch
					break;
				// update task
				case 5:
					// list all tasks for the user
					ListTasks.listTasks(tasks);
					// prompt the user for task id
					System.out.println("Enter task id: ");
					// get task id input from the user
					int taskId1 = GetInput.readUserInt();
					// prompt the user for new task name
					System.out.println("Enter new task name: ");
					// get task name from user input
					String taskName1 = GetInput.readUserString();
					// update the task with the new name
					Update.update(tasks, taskId1, taskName1);
					// exit switch statement
					break;
				// exit program
				case 0:
					// set running to false so while loop ends
					running = false;
					// exit switch statement
					break;
				// if they input an invalid number
				default: 
					System.out.println("Invalid entry...");
			}
			// attempt to do this code block
			try {
				// save the list of tasks to a local file
				Save.save(tasks);
			} catch (Exception e) {
				// if the file save fails, print the error to the console
				System.out.println(e.getMessage());
			}
		// keep looping while running == true
		} while (running);
	}
}
