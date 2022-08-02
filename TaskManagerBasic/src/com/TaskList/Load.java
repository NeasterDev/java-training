package com.TaskList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Load {
	public static ArrayList<TaskProperties> load() throws Exception {
		BufferedReader reader;
		ArrayList<TaskProperties> tasks = new ArrayList<TaskProperties>();
		
		try {
			reader = new BufferedReader(new FileReader("t.txt"));
			Scanner scan = new Scanner(reader);
			
			while (scan.hasNextLine()) {
				TaskProperties task = new TaskProperties(scan.nextLine(), scan.nextBoolean());
				tasks.add(task);
				scan.nextLine();
			}
			scan.close();
			reader.close();
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println("tasks" + tasks);
		return tasks;
		
	}
}
