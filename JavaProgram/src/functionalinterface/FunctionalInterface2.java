package com.functionalinterface;

@FunctionalInterface
interface A1 {
	public int add(int a, int b);
}

@FunctionalInterface
interface A2 extends A1 {
	default public void mul(int a, int b) {
		System.out.println("mul------------");
	}

	default public void sub(int a, int b) {
		System.out.println("sub------------");
	}
}

public class FunctionalInterface2 {

	public static void main(String[] args) {
		A1 a1=new A1() {
			public int add(int a, int b) {
				return 10;
			}
		};
	}
}
