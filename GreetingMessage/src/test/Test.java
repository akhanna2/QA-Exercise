package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String fullName =  scn.next() + " " + scn.next();
		
		System.out.println("Hello " + fullName + "!");

	}

}
