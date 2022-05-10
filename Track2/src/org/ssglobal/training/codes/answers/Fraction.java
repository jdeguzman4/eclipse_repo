package org.ssglobal.training.codes.answers;

import org.ssglobal.training.codes.arrays.SampleArrays; // Import
import org.ssglobal.training.codes.operators.McDonaldFood;

public class Fraction {
	
	public SampleArrays sample = new SampleArrays(); // Instantiate
	public McDonaldFood mcdo = new McDonaldFood();
	
	public static long id = 90L;

	public int numerator;
	public int denominator;

	public int getNumerator() {
		return numerator;
	}

	public int getDenomimator() {
		return denominator;
	}

	public void toFractionString() {
		Overflow over = new Overflow();
		System.out.println(numerator + "/" + denominator);
	}
	
	public Fraction add(Fraction summand) {
		numerator = numerator * summand.denominator + summand.numerator * denominator;
		denominator = denominator * summand.denominator;
		
		Fraction f = new Fraction();
		f.numerator = numerator;
		f.denominator = denominator;
		return f;
	}

	public Fraction multiply(Fraction factor) {
		numerator = numerator * factor.numerator;
		denominator = denominator * factor.denominator;
		
		Fraction f = new Fraction();
		f.numerator = numerator;
		f.denominator = denominator;
		return f;
	}
	
	public boolean greaterEqual(Fraction fraction) {
		
		int numer1 = numerator * fraction.denominator;
		int numer2 = fraction.numerator * denominator;
		// denominator assumed same for both
		
		if (numer1 >= numer2) {
			return true;
		} else {
			return false;	
		}
	}
}