package com.Serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Q implements Serializable {
	int i;

	static int j;
	transient int k;

}

public class M5 {

	public static void main(String[] args) throws Exception {

		Q a = new Q();
		a.i = 10;
		a.j = 20;
		a.k = 30;

		FileOutputStream fout = new FileOutputStream("txt.abc");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a);

		System.out.println("Done");

	}

}
