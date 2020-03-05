package com.instance_variable;

class A {

	int a =20;
}

public class M1 {

	public static void main(String[] args) {

		A a1 = new A();

		System.out.println(a1.a);
		a1.a = 10;

		System.out.println(a1.a);

	}

}
