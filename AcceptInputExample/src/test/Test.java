package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scn.next();
		System.out.println("Enter youe age: ");
		int age = scn.nextInt();
		System.out.println("Hi " + name +"! Your age is " + age + "!");
	}

}
