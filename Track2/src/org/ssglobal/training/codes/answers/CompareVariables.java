package org.ssglobal.training.codes.answers;

public class CompareVariables {
	
	public void comparePrimitive() {
		int x1 = 10;
		int x2 = 20;
		System.out.println(x1 == x2);
		
	}
	
	public void compareRefVar() {
		StringBuilder sb1 = new StringBuilder("Manila");
		StringBuilder sb2 = new StringBuilder("Manila");
		System.out.println(sb1.toString().equals(sb2.toString()));
	}
	
	public void compareStrVal() {
		// always use the new keyword
		String str1 = new String("Manila");
		String str2 = new String("Manila");
		System.out.println(str1.equals(str2));
		
		// do not use this
		String str3 = "Manila";
		String str4 = "Manila";
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str3 == str4);
	}

}
