package com.NicholasEaster.handson7;

public class Manager extends Employee {
	public String jobTitle;
	
	public Manager() {
		super();
		this.jobTitle = "";
	}
	
	// overloaded constructor
	public Manager(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() {
		return (getFirstName() + " " + getLastName() + " has worked at " + getCompanyName() + 
				" for " + getYearsAtCompany() + " year(s) as a(n) " + this.jobTitle);
	}
	
	// getters and setters
	public String getJobTitle() {
		return this.jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
}
