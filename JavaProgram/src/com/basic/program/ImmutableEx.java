package com.basic.program;
class A {
	private final int id;
	private final String name;

	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}

public class ImmutableEx {
	public static void main(String[] args) {

		A a1 = new A(1, "Noor");
		A a2 = new A(2, "Noor");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());

	}
}
