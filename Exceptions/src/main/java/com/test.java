package com;

public class test {

	public static void main(String[] args) {
		Eligibility obj = new Eligibility();
		try {
			obj.checkEligibility(18);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
		try {
			obj.checkCCNo("6747657765535236");
		} catch (InvalidCCNoException e) {
			e.printStackTrace();
		}

	}

}
