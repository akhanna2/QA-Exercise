package org;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Furniture> FurList = new ArrayList<Furniture>();
		
		Sofa s = new Sofa();
		Bed b = new Bed();
		Table t = new Table();
		
		FurList.add(s);
		FurList.add(b);
		FurList.add(t);
		
		FurnitureTest obj = new FurnitureTest();
		obj.MakeFurniture(FurList);
		
	}

}
