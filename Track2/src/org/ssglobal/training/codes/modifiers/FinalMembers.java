package org.ssglobal.training.codes.modifiers;

public class FinalMembers {
	
	public final double PI = 3.141617;
	public final StringBuilder FLOWER = new StringBuilder("Santan");
	
	public final void accessWithoutOverride() {
		
	}
	
	public void accessPoint() {
		FLOWER.append(" in Baguio");
		System.out.println(FLOWER);
	}

}
