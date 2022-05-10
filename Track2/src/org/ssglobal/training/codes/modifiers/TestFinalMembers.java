package org.ssglobal.training.codes.modifiers;

public class TestFinalMembers extends FinalMembers {

	public static void main(String[] args) {
		FinalMembers fm = new FinalMembers();
		System.out.println(fm.PI);
		
		fm.accessWithoutOverride();
		fm.accessPoint();
	}

	
	public void accessPoint() {
		accessWithoutOverride();
	}

}
