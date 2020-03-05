package com.Serilization;

class Xyz {

	void m1() {
		System.out.println("a");
	}
}

class Abc extends Xyz {

	void m2() {
		System.out.println("b");
	}
}

class Hi extends Abc {
	void m3() {

		System.out.println("c");
	}
}

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abc a = new Abc();
		a.m1();
		a.m2();

	}

}
