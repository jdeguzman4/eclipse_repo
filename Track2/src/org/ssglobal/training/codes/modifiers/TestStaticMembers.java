package org.ssglobal.training.codes.modifiers;

public class TestStaticMembers {

	public static void main(String[] args) {
		
		StaticMembers sm1 = new StaticMembers();
		StaticMembers sm2 = new StaticMembers();
		StaticMembers sm3 = new StaticMembers();

		// Instance Variables
		sm1.e = 3.17;
		System.out.println(sm1.e);
		//sm2.e = 4.17;
		System.out.println(sm2.e);
		//sm3.e = 5.17;
		System.out.println(sm3.e);
		
		// Static Variables
		StaticMembers.pi = 4.141717;
		System.out.println(StaticMembers.pi);
		System.out.println(StaticMembers.pi);
		System.out.println(StaticMembers.pi);
		
		// Instance Methods
		sm1.isZero(0);
		sm2.isZero(100);
		sm3.isZero(-1);
		
		// Static Methods
		StaticMembers.even(-10);
		StaticMembers.even(100);
		StaticMembers.even(5);
	}

}
