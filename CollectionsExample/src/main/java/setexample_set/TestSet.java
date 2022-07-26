package setexample_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import arraylist_org.Item;

public class TestSet {

	public static void main(String[] args) {
		Set<String> fruits = new TreeSet<String>();

		fruits.add("apple");
		fruits.add("pineapple");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("orange");
		System.out.println(fruits);
		
		Set<Item> itemSet = new HashSet<Item>();
		
		Item one = new Item("TV", 2000, "Samsung", 1);
		Item two = new Item("Smartphone", 1200, "Samsung", 1);
		Item three = new Item("Bluetooth mic", 100, "Logi", 1);
		Item four = new Item("Tripod", 50, "Logi", 1);
		
		itemSet.add(one);
		itemSet.add(two);
		itemSet.add(three);
		itemSet.add(four);
		
		System.out.println(itemSet);

	}

}
