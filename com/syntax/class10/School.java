package com.syntax.class10;

public class School {

	private String SSN, email;
	public String name, lastName, stuId;
	
	public School(String name, String lastName, String stuId) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.stuId = stuId;
	}
	
	// SSS must be 9 character long
	// can only contain numbers
	
	// SSN = 123 - 45 - 4569
	public void setSSN(String SSN) {
		
		if(SSN.length()!=9) {
			System.out.println("SSN must be 9 characters");
		}else {
			if(SSN.replaceAll("[0-9]", "").length()>0) {
				System.out.println("SSN can only include numbers");
			}else {
				this.SSN=SSN;
			}
		}
	}
	
	//  ***-**-4578 --> we just want to see only last four digits
	public String getSSN() {
		
		String tempSSN="";
		
		for(int i=0; i<7; i++) {
			if(i==3 || i==6) {
				tempSSN+="-";
			}else {
				tempSSN+="*";
			}
		}		
		tempSSN=tempSSN+SSN.substring(5);		
		return tempSSN;
	}
}
