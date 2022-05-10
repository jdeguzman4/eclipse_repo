package org.ssglobal.training.codes.modifiers;

public class GraphSearch extends MyLog {
	
	public void plot() {
		GraphMe gm = new GraphMe();
		gm.scatter(); // Sharing or Reusing Method
		computeLogBase10();
		computeLogBase2();
	}

}
