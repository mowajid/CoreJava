package com.centuriLink;

import java.util.*;
import java.util.Map.Entry;

public class firstNonRepeatedChar2 {
	public static char getFirstNonRepeatedChar(String str) {
		Map<Character, Integer> counts = new LinkedHashMap<>();

		for (char c : str.toCharArray()) {
			if (counts.get(c) != null)
				counts.put(c, counts.get(c) + 1);
			else
				counts.put(c, 1);
		}

		for (Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1)
				return entry.getKey();
		}

		throw new RuntimeException("didn't find any non repeated Character");
	}

	// Driver method
	public static void main(String[] args) {
		String str = "geeksk8geeksdbdb800919";
		char index = getFirstNonRepeatedChar(str);

		System.out.println(index);
	}
}