package org;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter first name");
		String fName=scn.next();
		System.out.println("enter last name");
		String lName=scn.next();
		String fullName=fName+" "+lName;
		System.out.println("Hello "+fName+" "+lName);
		System.out.println("Hello "+fullName);
		
	}

}
