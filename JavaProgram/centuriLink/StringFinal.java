package com.centuriLink;

public class StringFinal {
	public static void main(String[] args) {
		final String s1 = "JLC";
		 final String s2 = "INDIA";

		String s4 = "JLC" + "INDIA";

		String s5 = s1.concat(s2);

		System.out.println(s4 == s5);

	}
}
