package com.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.soring.Costumer;

public class FilterEx {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Noor", "Noor", "Noor");
		list.forEach(x -> System.out.println(x));
		list.stream().filter(x -> x.startsWith("Noor")).forEach(x -> System.out.println(x));

		Costumer c1 = new Costumer(100, "A");
		Costumer c2 = new Costumer(200, "AA");
		Costumer c3 = new Costumer(300, "A");
		Costumer c4 = new Costumer(400, "A");

		List<Costumer> list1 = new ArrayList<>();
		list1.add(c1);
		list1.add(c2);
		list1.add(c3);
		list1.add(c4);

		list1.stream().filter(x -> "AA".equals(x.getName())).forEach(x -> System.out.println(x.getId()));
		Costumer c = list1.stream().filter(x -> {
			if ("AA".equals(x.getName())) {
				return true;
			} else {
				return false;
			}
		}).findAny().orElse(null);

		System.out.println(c.getName());

		// filter and map

		list1.stream().filter(x -> {
			if ("A".equals(x.getName()))
				return true;
			else
				return false;
		}).map(x->x.getName()).forEach(z->System.out.println("Filter and Map-->"+z));;
	}
}
