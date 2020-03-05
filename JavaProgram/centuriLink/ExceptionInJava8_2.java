package com.centuriLink;

import java.util.*;
import java.util.function.Consumer;

public class ExceptionInJava8_2 {
	static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		};
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 0);
		list.forEach(lambdaWrapper(i -> System.out.println(50 / i)));

	}
}
