package com.syntax.class09;

public class TestInheritance {
	public static void main(String[] args) {

		Student stu0 = new Student("Cary","Smith","A3286374");
//		stu0.name= "James";
//		stu0.lastName = "Bond";
//		stu0.stuID = "A3296412";
//		stu0.printDetails();
//		
//		System.out.println();
//		
		Student stu1 = new Student("Jimmy","Neutron","B874326");
//		System.out.println(stu1.name);
//		System.out.println(stu1.lastName);
//		
//	
//		System.out.println();
//		
		School stu2 = new School("Indiana", "Jones");
//		System.out.println(stu2.name);
//		System.out.println(stu2.lastName);
		
		System.out.println();

		School stu3 = new Student("Donald", "Duck", "C823949");
		stu3.printDetails();
		// stu.study();
		School.schoolName = "Syntax Technology";
		
		System.out.println(stu1.schoolName);
		System.out.println(stu2.schoolName);
		
		
		
		
	}

}
