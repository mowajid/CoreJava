package com.stringjoiner;

import java.util.Arrays;
import java.util.List;

public class StringJoin {
	public static void main(String[] args) {
		String str=String.join("aa","bb","cc");
		System.out.println(str);
		
		List<String> list=Arrays.asList("java",".net","c","c++");
		String str1=String.join(",", list);
		System.out.println(str1);
		
		
		
	}
}
