package com.centuriLink;

import java.util.*;
import java.util.function.Consumer;

public class ExceptionInJava8_3 {
	static <T, E extends Exception> Consumer<T> lambdaWrapper(Consumer<T> consumer, Class<E> clazz) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (Exception ex) {
				try {
					E exCast = clazz.cast(ex);
					System.out.println(exCast.getMessage());
				} catch (Exception e) {
					throw e;
				}
			}
		};
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 0);
		list.forEach(lambdaWrapper(i -> System.out.println(50 / i), ArithmeticException.class));

	}
}
