package com.centuriLink;

interface AA {
	static public void get() {}
}
public class StringJava8 implements AA {
	public static void main(String[] args) {
		AA.get();
	}
}
