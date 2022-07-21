package org;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter amount");
		int amount = scn.nextInt();
		System.out.println("Enter rate");
		int rate = scn.nextInt();
		System.out.println("Enter time");
		int time = scn.nextInt();
		int simInt = amount * rate * time / 100;
		int finalAmt = amount + simInt;
		System.out.println(simInt);
		System.out.println(finalAmt);

	}
}
