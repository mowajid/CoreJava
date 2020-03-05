package com.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapIterable {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(110, "Noor");
		map.put(210, "Noor");
		map.put(310, "Noor");
		map.put(410, "Noor");
		map.put(510, "Noor");
		map.forEach((x, y) -> System.out.println(x + " " + y));

		List<String> list = new ArrayList<>();
		list.add("Noor");
		list.add("Noor");
		list.add("Noor");
		list.add("Noor");

		list.forEach(x -> System.out.println(x));

		// Filter
		list.stream().filter(x -> x.startsWith("Noo")).forEach(x -> System.out.println(x));
	}
}
