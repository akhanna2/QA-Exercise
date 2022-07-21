package org;

import java.util.List;

public class FurnitureTest {
	public void MakeFurniture(List<? extends Furniture> list) {
		for(Furniture i: list) {
			i.Make();
		}
	}
}
