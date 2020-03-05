package com.FileHendling;

import java.io.File;

public class PrintallFileAndDirNameEx {

	public static void main(String[] args) throws Exception {

		int count = 0;
		File f1 = new File("D:\\lara_java");

		String[] s1 = f1.list();

		for (String s : s1) {
			count++;

			System.out.println(s1);
		}
		System.out.println(+count);

	}

}
