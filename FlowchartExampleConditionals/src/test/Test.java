package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter your number");
		double a = scn.nextDouble();
		
		if(a > 2000) 
		{
			System.out.println("A");
			if(a > 6000)
			{
				System.out.println("C");
			}else
			{
				System.out.println("B");
				if(a > 4000)
				{
					System.out.println("D");
				}else
				{
					System.out.println("E");
				}
			}
		}else
		{
			System.out.println("1");
			if(a > 100)
			{
				System.out.println("3");
				if(a > 600)
				{
					System.out.println("5");
				}else
				{
					System.out.println("4");
					if(a > 500)
					{
						System.out.println("6");
					}else
					{
						System.out.println("7");
					}
				}
			}else
			{
				System.out.println("2");
			}
		}

	}

}
