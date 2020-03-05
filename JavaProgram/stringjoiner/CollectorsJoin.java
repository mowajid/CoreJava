package com.stringjoiner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsJoin {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "CC");
		String str=list.stream().collect(Collectors.joining(","));
		System.out.println(str);

	}
}
