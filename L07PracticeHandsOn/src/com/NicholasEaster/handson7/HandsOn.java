package com.NicholasEaster.handson7;

public class HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		Engineer engineer = new Engineer();
		Manager manager = new Manager();
		
		employee.setFirstName("Nicholas");
		employee.setLastName("Easter");
		employee.setCompanyName("Infosys");
		employee.setYearsAtCompany(0);
		
		System.out.println(employee.toString());
		
		engineer.setFirstName("Robert");
		engineer.setLastName("California");
		engineer.setCompanyName("Dunder Mifflin");
		engineer.setYearsAtCompany(3);
		engineer.setJobTitle("CEO");
		
		System.out.println(engineer.toString());
		
		manager.setFirstName("John");
		manager.setLastName("Wick");
		manager.setCompanyName("Mercs4Hire");
		manager.setYearsAtCompany(25);
		manager.setJobTitle("Mercenary");
		
		System.out.println(manager.toString());
	}

}
