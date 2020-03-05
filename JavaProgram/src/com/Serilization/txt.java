package com.Serilization;

import java.io.File;

public class txt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f1 = new File("txt.abc");
		System.out.println(f1.exists());

		f1.createNewFile();

		System.out.println(f1.exists());
	}

}
