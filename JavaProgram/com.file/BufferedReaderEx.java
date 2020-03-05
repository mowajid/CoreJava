package com.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException{
		String filename="/home/noor/Desktop/Test1.txt";
		try {
			BufferedReader br=Files.newBufferedReader(Paths.get("/home/noor/Desktop/Test1.txt"));
			List<String> list=new ArrayList<>();
			list =br.lines().collect(Collectors.toList());
			list.forEach(x->System.out.println(x));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
