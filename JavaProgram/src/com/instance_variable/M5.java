package com.instance_variable;

public class M5 {

	int a = 10;

	public static void main(String[] args) {

		System.out.println(E.a); // Cannot make a static reference to the non-static field E.a
	}

}
