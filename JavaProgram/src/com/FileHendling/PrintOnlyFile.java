package com.FileHendling;

import java.io.File;

public class PrintOnlyFile {

	public static void main(String[] args) throws Exception {

		int count = 0;

		File f1 = new File("D:\\ lara_java");

		String[] s = f1.list();

		for (String s1 : s) {

			File f2 = new File(f1, s1);

			if (f1.isFile())
				;

			count++;

			System.out.println(s1);
		}
		System.out.println(+count);

	}

}
