package org;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Welcome to my app!");
		System.out.println("What would you like to do?");
		System.out.println("1. Read record");
		System.out.println("2. Update record");
		System.out.println("Enter number:");
		
		int answer = scn.nextInt();
		
		switch(answer) {
		case 1:
			ReadRecord read = new ReadRecord();
			read.read();
			break;
		case 2:
			System.out.println("Enter pid:");
			int pid = scn.nextInt();
			
			System.out.println("Enter name:");
			String name = scn.next();
			
			System.out.println("Enter price:");
			double price = scn.nextDouble();
			
			System.out.println("Enter brand:");
			String brand = scn.next();
			
			System.out.println("Enter qty:");
			int qty = scn.nextInt();
			
			AddRecord add = new AddRecord();
			add.add(pid, name, price, brand, qty);
			break;
		}
		scn.close();


	}

}
