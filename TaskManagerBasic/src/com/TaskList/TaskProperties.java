package com.TaskList;

import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;

public class TaskProperties implements Serializable {

	private String taskName;
	private boolean isComplete;
	
	// default constructor
	public TaskProperties() {}
	
	// overloaded constructor with name 
	public TaskProperties(String taskName) {
		this.taskName = taskName;
	}
	
	// overloaded constructor with all fields
	public TaskProperties(String taskName, boolean isComplete) {
		this.taskName = taskName;
		this.isComplete = isComplete;
	}
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	@Override
	public String toString() {
		return this.taskName + (this.isComplete ? " completed" : " not completed");
	}
	

	

	
	
}
