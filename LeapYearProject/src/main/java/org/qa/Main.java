package org.qa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter year:");
		
		int year = scn.nextInt();
		LeapYear l = new LeapYear();
		System.out.println(l.CheckLeapYear(year));
		
	}
}
