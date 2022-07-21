package org;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Which method would you like to use?");
		System.out.println("1: Simple Interest");
		System.out.println("2: Is Prime?");
		System.out.println("3: Is divisible by 5");
		System.out.println("Enter a number:");
		
		int choice = scn.nextInt();
		
		if(choice == 1)
		{
			SimpleInterest s = new SimpleInterest();
			
			System.out.println("Enter amount:");
			double amount = scn.nextDouble();
			
			System.out.println("Enter rate:");
			double rate = scn.nextDouble();
			
			System.out.println("Enter years:");
			int years = scn.nextInt();
			
			System.out.println("Final amount is " + s.FinalAmount(amount, rate, years));
		}
		else if(choice == 2)
		{
			IsPrime p = new IsPrime();
			
			System.out.println("Enter number to check:");
			int num = scn.nextInt();
			
			boolean answer = p.CheckIfPrime(num);
			
			if(answer)
			{
				System.out.println(num + " is a prime number");
			}
			else
			{
				System.out.println(num + " is not a prime number");
			}
		}
		else if(choice == 3)
		{
			DivisibleBy5 d = new DivisibleBy5();
			
			System.out.println("Enter number to check:");
			int num = scn.nextInt();
			
			boolean answer = d.IsDivisibleBy5(num);
			
			if(answer)
			{
				System.out.println(num + " is divisible by 5");
			}
			else
			{
				System.out.println(num + " is not divisible by 5");
			}
		}

	}

}
