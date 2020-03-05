package com.basic.program;
class AA {
	public int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void get() {
		int c = a / a;
		System.out.println(a);
	}
}

public class Test {

	public static void main(String[] args) {
		AA a1 = new AA();
		a1.a=90;
		AA a2 = new AA();
	
		System.out.println(a2.getA());

	}
}
