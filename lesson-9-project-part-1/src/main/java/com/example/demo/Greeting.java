package com.example.demo;
// created greeting class to hold information in GreetingController
public class Greeting {
	// variables to hold id and name
	public long id;
	public String name;
	
	// constructor to take the id and name and set it to this instance
	// of id and name
	public Greeting(long id, String name) {
		if (id == 0) {
			this.id = 0;
		// checks if the id is even, if it is subtract 1 to make it odd;
		} else if (id % 2 == 0) {
			id = id - 1;
			this.id = id;
		// else just set the id to this instance of id
		} else {
			this.id = id;
		}
		// set the name to this instance of id
		this.name = name;
	}
}
