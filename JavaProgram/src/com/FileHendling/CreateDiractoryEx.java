package com.FileHendling;

// how to create directory

import java.io.File;

public class CreateDiractoryEx {

	public static void main(String[] args) throws Exception {

		File f1 = new File("dugra12345");

		System.out.println(f1.exists());
		f1.mkdir();

		System.out.println(f1.exists());

	}

}
