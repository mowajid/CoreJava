/*package com.centuriLink;

import java.util.*;
import java.util.function.Consumer;

public class ExceptionInJava8_checked_1 {

	static void writeToFile(Integer integer) throws IOException {
		// logic to write to file which throws IOException
	}

	Consumer<Integer> consumer = new Consumer<Integer>() {

		@Override
		public void accept(Integer integer) {
			writeToFile(integer);
		}
	};

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		integers.forEach(i -> writeToFile(i));
	}
}
*/