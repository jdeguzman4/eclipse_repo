package org.ssglobal.training.codes.answers;

public class VarArg {
	
	public void printNums(int... nums) {
		for(int lookup: nums) {
			System.out.println(lookup);
		}
	}
	
	public void acceptComplexData(int x, String... names) {
		
	}

}
