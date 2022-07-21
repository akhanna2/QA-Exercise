package org;

public class SimpleInterest {
	public double FinalAmount(double amount, double rate, int years) {
		double simpleInterest = amount * rate * years;
		double finalAmount = amount + simpleInterest;
		
		return finalAmount;
	}

}
