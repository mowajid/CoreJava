package com.static_variables;

class T {

	static int a;
}

public class M2 {

	public static void main(String[] args) {

		T t1 = new T();
		T t2 = new T();

		System.out.println(t1.a + "\t" + t2.a);

		t1.a = 10;

		System.out.println(t1.a + "\t" + t2.a);

	}

}
