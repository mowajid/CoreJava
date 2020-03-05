package com.FileHendling;

// how to create file

import java.io.File;
import java.io.IOException;

public class CtreateFile {
	public static void main(String[] args) throws IOException {

		File f = new File("new.txt");

		System.out.println(f.exists());

		f.createNewFile();

		System.out.println(f.exists());

	}

}
