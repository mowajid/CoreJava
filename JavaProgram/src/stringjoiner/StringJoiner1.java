package com.stringjoiner;

import java.util.StringJoiner;

public class StringJoiner1 {
	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(",");
		sj.add("Noor1");
		sj.add("Noor2");
		sj.add("Noor3");
		System.out.println(sj);
		
		StringJoiner sj2=new StringJoiner("/","-Prefix","-suffix");
		sj2.add("Noor1");
		sj2.add("Noor2");
		sj2.add("Noor3");
		System.out.println(sj2);
		
		
		
	}
}
