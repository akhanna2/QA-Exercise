package map_org;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map<Integer, String> autoMap = new HashMap<Integer, String>();
		autoMap.put(101, "Sedan Car");
		autoMap.put(102, "Bus");
		autoMap.put(103, "Truck");
		autoMap.put(104, "Bike");
		
		for(Entry i: autoMap.entrySet()) {
			System.out.println(i.getKey() + ": " + i.getValue());
			//System.out.println(i);
		}
		
		Set<Integer> autoKey = new HashSet<Integer>();
		Set<String> autoValue = new HashSet<String>();
		
		for(int i: autoMap.keySet()) {
			autoKey.add(i);
		}
		
		for(String i: autoMap.values()) {
			autoValue.add(i);
		}
		System.out.println(autoKey);
		System.out.println(autoValue);
		
		Map itemMap = new HashMap();
		
		Item one = new Item("TV", 2000, "Samsung", 1);
		Item two = new Item("Smartphone", 1200, "Samsung", 1);
		Item three = new Item("Bluetooth mic", 100, "Logi", 1);
		Item four = new Item("Tripod", 50, "Logi", 1);
		
		itemMap.put(one.name, one.brand);
		itemMap.put(two.name, two.brand);
		itemMap.put(three.name, three.brand);
		itemMap.put(four.name, four.brand);
		System.out.println(itemMap);

	}

}
