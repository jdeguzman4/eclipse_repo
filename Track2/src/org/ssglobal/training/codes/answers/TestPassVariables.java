package org.ssglobal.training.codes.answers;

public class TestPassVariables {

	public static void main(String[] args) {
		PassVariables cv = new PassVariables(); // cv is the RefVar (pointer-like)
		                                              // new CompareVariables() is the object
		
		// Primitive Var
		int testX = 10;
		System.out.format("This is the original num is %d. \n", testX);
		cv.passPrimitive(testX);
		System.out.format("This new num is %d. \n", testX);
		
		
		// [0000555FFAAB]testsb -> [12356644ABCD] ==> 12356644ABCD("Manila") 
		// Reference Var
		StringBuilder testsb = new StringBuilder("Manila "); // [12356644ABCD] ("Manila")
		System.out.format("This is the original sb is %s. \n", testsb);
		cv.passRefVar(testsb);
		System.out.format("This is the new sb is %s. \n", testsb);
		
		String testStr = new String("Manila");
		System.out.format("This is the original testStr is %s. \n", testStr);
		cv.passStrVal(testStr);
		System.out.format("This is the new testStr is %s. \n", testStr);
		
	}

}
