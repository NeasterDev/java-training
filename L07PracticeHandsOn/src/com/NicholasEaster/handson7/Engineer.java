package com.NicholasEaster.handson7;

public class Engineer extends Employee {
	public String jobTitle;
	
	public Engineer() {
		super();
		this.jobTitle = "";
	}
	
	// overloaded constructor
	public Engineer(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() {
		return (getFirstName() + " " + getLastName() + " has worked at " + getCompanyName() + 
				" for " + getYearsAtCompany() + " year(s) as a(n) " + this.jobTitle);
	}
	
	public String getJobTitle() {
		return this.jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
}
