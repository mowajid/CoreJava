package com.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFiles {

	public static void main(String[] args) throws IOException{
		String filename="/home/noor/Desktop/Test1.txt";
		try {
			Stream file=Files.lines(Paths.get("/home/noor/Desktop/Test1.txt"));
			file.forEach(x->System.out.println(x));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
