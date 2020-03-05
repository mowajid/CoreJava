package com.static_variables;

class P {

	static int a;
}

public class M7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new P().a = 10;

		System.out.println(new P().a);

	}

}
