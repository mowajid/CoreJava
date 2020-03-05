package com.static_variables;

class S {
	static int a = 10;
}

public class M3 {

	public static void main(String[] args) {

		S s = new S();
		System.out.println(s.a);

	}

}
