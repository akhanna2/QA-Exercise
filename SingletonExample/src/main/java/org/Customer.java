package org;

public class Customer {
	private static Customer cust = new Customer();
	private Customer() {}
	
	public static Customer getCustomer() {
		return cust;
	}
	
	public void hello() {
		System.out.println("Hello");
	}

}
