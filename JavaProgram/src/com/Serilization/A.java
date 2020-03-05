package com.Serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.imageio.stream.FileImageInputStream;

class Q1 implements Serializable { // serilization
}

class B extends Q1 {

	int q;
}

public class A {

	public static void main(String[] args) throws Exception {

		B b1 = new B();

		b1.q = 100;

		B b2 = new B();

		b2.q = 200;
		B b3 = new B();

		b3.q = 300;

		FileOutputStream fout = new FileOutputStream("txt.abc");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(b1);
		out.writeObject(b2);
		out.writeObject(b3);

		System.out.println("===============");

		FileInputStream fin = new FileInputStream("txt.abc");
		ObjectInputStream in = new ObjectInputStream(fin);

		B obj1 = (B) in.readObject();

		System.out.println(obj1.q);

		B obj2 = (B) in.readObject();

		System.out.println(obj2.q);

		B obj3 = (B) in.readObject();

		System.out.println(obj3.q);

		System.out.println(b1 == obj1);
		System.out.println(b2 == obj2);
		System.out.println(b3 == obj3);

		System.out.println(b1.q == obj1.q);
		System.out.println(b2.q == obj2.q);
		System.out.println(b3.q == obj3.q);

		b1.q = 50000;
		System.out.println(b1.q);
		System.out.println(obj1.q);
		System.out.println("==========");

		obj1.q = 3000000;
		System.out.println(b1.q); // de copy operation here
		System.out.println(obj1.q);

	}

}

// super class is serilizable sub class also serializable it is callad serilization inheritance

// sholow copy oreration 