package com.ne;

import com.ne.student.Student;

public class primaryPackage {
	public static void main(String[] args) {
	    // instantiate three student objects
	    Student student1 = new Student();
	    Student student2 = new Student();
	    Student student3 = new Student();

	    // set the information for student 1
	    student1.setFirstName("Harry");
	    student1.setLastName("Potter");
	    student1.setCourseFocus("Flying");

	    // set the information for student 2
	    student2.setFirstName("Ron");
	    student2.setLastName("Weasley");
	    student2.setCourseFocus("Herbology");

	    // set the information for student 3
	    student3.setFirstName("Hermione");
	    student3.setLastName("Granger");
	    student3.setCourseFocus("Potions");

	    // print information for each student
	    System.out.println(student1.getFirstName() + " " + student1.getLastName() + " is studying " + student1.getCourseFocus());
	    System.out.println(student2.getFirstName() + " " + student2.getLastName() + " is studying " + student2.getCourseFocus());
	    System.out.println(student3.getFirstName() + " " + student3.getLastName() + " is studying " + student3.getCourseFocus());
	}
}
