package com.NicholasEaster.handson7;

public class Employee {
	public String firstName;
	public String lastName;
	public String companyName;
	private int yearsAtCompany;
	
	public Employee() {
		firstName = "";
		lastName = "";
		companyName = "";
		setYearsAtCompany(-1);
	}
	
	public Employee(String firstName, String lastName, String companyName, int yearsAtCompany) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.setYearsAtCompany(yearsAtCompany);
	}
	
	@Override
	public String toString() {
		return (firstName + " " + lastName + " has worked at " + companyName + 
				" for " + yearsAtCompany + " year(s)");
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public int getYearsAtCompany() {
		return yearsAtCompany;
	}

	public void setYearsAtCompany(int yearsAtCompany) {
		this.yearsAtCompany = yearsAtCompany;
	}
}
