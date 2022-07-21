package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name = scn.next();
		
		System.out.println("Enter amount:");
		int amount = scn.nextInt();
		
		System.out.println("Enter rate (as decimal):");
		float rate = scn.nextFloat();
		
		System.out.println("Enter time (as years):");
		int time = scn.nextInt();
		
		float simpleInterest = amount * rate * time;
		float finalAmount = amount + simpleInterest;
		
		System.out.println(name + ", you simple interest is £" + simpleInterest + " and the final amount is £" + finalAmount + ".");

	}

}
