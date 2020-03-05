package com.Serilization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M6 {

	public static void main(String[] args) throws Exception {

		FileInputStream fin = new FileInputStream("txt,abc");
		ObjectInputStream in = new ObjectInputStream(fin);

		Q obj = (Q) in.readObject();

		System.out.println(obj.i);
		System.out.println(obj.j);

		System.out.println(obj.k);

	}

}
