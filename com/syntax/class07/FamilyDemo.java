package com.syntax.class07;

public class FamilyDemo {
	public static void main(String[] args) {
		
		// last name does not need an object
		SmithMember.lastName = "Smith";
		
		
		SmithMember member1 = new SmithMember();
		member1.firstName = "Adam";
		member1.age = 45;
		
		member1.printInfo();
		
		SmithMember member2 = new SmithMember();
		member2.firstName = "Mary";
		member2.age = 42;
		
		
		member2.printInfo();
		
System.out.println("----------Re-assinging last name------------");
		
		SmithMember.lastName = "Jordan";
		
		
		member1.printInfo();
		member2.printInfo();
		
		
		System.out.println("------baby is coming-------");
		
		SmithMember baby = new SmithMember();
		baby.firstName ="Ali";
		// Don't need to assign the lastName of the baby
		baby.age = 0;
		
		baby.printInfo();
		
	}
}
