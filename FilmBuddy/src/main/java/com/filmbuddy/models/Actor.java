package com.filmbuddy.models;

import java.sql.Timestamp;

// actor model to hold data for the actors stored in the database
public class Actor {
	// private variable to hold the ...
    private int actor_id; // actor id
    private String first_name; // first name
    private String last_name; // last name
    private Timestamp last_update; // last time the information was updated
    private String title; // and the relevant title of movie they starred in
    
    // getters and setters for all variables
    public int getActor_id() {
    	return actor_id;
    }
    public void setActor_id(int actor_id) {
    	this.actor_id = actor_id;
    }
    public String getFirst_name() {
    	return first_name;
    }
    public void setFirst_name(String first_name) {
    	this.first_name = first_name;
    }
    public String getLast_name() {
    	return last_name;
    }
    public void setLast_name(String last_name) {
    	this.last_name = last_name;
    }
    public Timestamp getLast_update() {
    	return last_update;
    }
    public void setLast_update(Timestamp last_update) {
    	this.last_update = last_update;
    }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}