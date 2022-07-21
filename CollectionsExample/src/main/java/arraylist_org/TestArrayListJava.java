package arraylist_org;

import java.util.ArrayList;

public class TestArrayListJava {

	public static void main(String[] args) {
		ArrayList<Item> itemList = new ArrayList<Item>();
		
		Item one = new Item("TV", 2000, "Samsung", 1);
		Item two = new Item("Smartphone", 1200, "Samsung", 1);
		Item three = new Item("Bluetooth mic", 100, "Logi", 1);
		Item four = new Item("Tripod", 50, "Logi", 1);
		
		itemList.add(one);
		itemList.add(two);
		itemList.add(three);
		itemList.add(four);
		
		System.out.println(itemList);
	}

}
