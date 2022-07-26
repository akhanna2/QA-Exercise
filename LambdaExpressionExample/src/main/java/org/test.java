package org;

public class test {

	public static void main(String[] args) {
		Doable do1 = () -> {System.out.println("Do something");};
		Transferrable tr = () -> {System.out.println("Transfer something");};
		
		Workable wo = new Workable() {
			public void work() {
				System.out.println("working");
			}
			public void getWorkHours() {
				System.out.println("Getting hours");
			}
		};
		
		do1.doSomething();
		tr.transfer();
		wo.work();
		wo.getWorkHours();

	}

}
