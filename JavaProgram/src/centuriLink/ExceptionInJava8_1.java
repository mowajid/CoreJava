package com.centuriLink;

import java.util.*;
import java.util.function.Consumer;

public class ExceptionInJava8_1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 0);
		list.forEach(x -> {
			try {
				System.out.println(x / 0);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		});
	}
}
