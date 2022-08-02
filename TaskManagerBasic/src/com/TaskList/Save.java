package com.TaskList;
import java.io.FileWriter;
import java.util.ArrayList;

public class Save {
	// method to save ArrayList of tasks to local file
	public static void save(ArrayList<TaskProperties> task) throws Exception {
		// 
		try{
		    FileWriter writer = new FileWriter("t.txt");
		    for (int i = 0; i < task.size(); i++) {
		    	writer.write(task.get(i).getTaskName() + "\n" + task.get(i).isComplete() + "\n");
		    }
		    
		    writer.flush();
		    writer.close();

		}catch (Exception e) {
		    e.getMessage();
		}
	}
}
