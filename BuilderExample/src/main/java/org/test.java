package org;

public class test {

	public static void main(String[] args) {
		Product p1 = new ProductBuilder()
				.id(1)
				.name("TV")
				.price(500)
				.brand("Samsung")
				.buildProduct();

	}

}
