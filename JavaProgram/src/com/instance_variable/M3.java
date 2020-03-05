package com.instance_variable;

class Q {

	int a=10;
}

public class M3 {

	public static void main(String[] args) {

		new Q().a = 99;

		System.out.println(new Q().a);

	}

}
