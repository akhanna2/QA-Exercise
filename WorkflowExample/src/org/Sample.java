package org;
import java.util.Scanner;

public class Sample {
	
	
	
	public static void action3() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter first name");
		String fName=scn.next();
		System.out.println("enter last name");
		String lName=scn.next();
		String fullName=fName+" "+lName;
		System.out.println("Hello "+fName+" "+lName);
		System.out.println("Hello "+fullName);
		
	}
	
	public static int  action4() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter amount");
		int amount = scn.nextInt();
		System.out.println("Enter rate");
		int rate = scn.nextInt();
		System.out.println("Enter time");
		int time = scn.nextInt();
		int simInt = amount * rate * time / 100;
		int finalAmt = amount + simInt;
		//System.out.println(simInt);
		//System.out.println(finalAmt);
		return finalAmt;
	}
	
	public static void main(String[] args) {
		action3();
		System.out.println(action4());

	}

}
