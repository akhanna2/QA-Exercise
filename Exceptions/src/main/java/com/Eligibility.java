package com;

public class Eligibility {
	public void checkEligibility(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("You are not allowed to vote");
		}else {
			System.out.println("You are allowed to vote");
		}
	}
	
	public void checkCCNo(String num) throws InvalidCCNoException{
		if(num.length() != 16) {
			throw new InvalidCCNoException("CC number must be 16 digits");
		}else {
			System.out.println("CC number is 16 digits");
		}
	}

}
