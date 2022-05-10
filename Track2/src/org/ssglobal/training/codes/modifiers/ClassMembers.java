package org.ssglobal.training.codes.modifiers;

public class ClassMembers {
	
	// Static Variables
	public static long id = 1L;
	double salary = 100.5;
	protected int key = 68638453;
	private char letter = 'v';
	
	// Instance Variables
	public int age = 10;
	
	// Methods
	public void showData() {
		id = 2L;
		salary = 5000.5;
		key = 855885;
		letter = 'h';
	}
	
	void printData() {
		
	}
	
	protected void authenticate() {
		
	}
	
	private void encryptData() {
		
	}
	
	public void reference() {
		showData();
		printData();
		authenticate();
		encryptData();
	}

}
