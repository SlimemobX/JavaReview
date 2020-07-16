package com.syntax.class08;

public class Dermatologist extends Doctor{
	public int dermatologyId;
	
	public Dermatologist(String name, String specialty,int licenseId, int dermatologyId) {
		
		// I can use super of this word
		super(name, specialty, licenseId);
		
		this.dermatologyId = dermatologyId;
		
	}
	
	
	public void applySkinTreatment() {
		System.out.println("Applies some cream on patient");
	}

}
