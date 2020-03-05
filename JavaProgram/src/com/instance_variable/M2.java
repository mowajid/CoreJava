package com.instance_variable;

class N {
	int a;

}

public class M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		N n = new N();

		N n1 = new N();

		System.out.println(n.a + "\t" + n1.a);

		n.a = 10;

		System.out.println(n.a + "\t" + n1.a);

	}

}
