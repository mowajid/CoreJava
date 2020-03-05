package com.centuriLink;

class A {
	public int Facto(int n) {
		if (n == 0)
			return 1;
		else
			return n * Facto(n - 1);
	}
}

public class FanonacciseriesRecurtion {
	public static void main(String[] args) {
		A a1 = new A();
		int a = a1.Facto(5);
		System.out.println(a);
	}
}
