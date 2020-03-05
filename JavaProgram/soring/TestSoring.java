package com.soring;

import java.util.ArrayList;
import java.util.List;

public class TestSoring {
	public static void main(String[] args) {
		Costumer c1=new Costumer(122, "Noor1");
		Costumer c2=new Costumer(222, "Noor2");
		Costumer c3=new Costumer(322, "Noor3");
		Costumer c4=new Costumer(422, "Noor4");
		List<Costumer> list=new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
	
		
		list.sort((Costumer o1,Costumer o2)->o2.getName().compareTo(o1.getName()));
		
		list.forEach(x->System.out.println(x.getId()+" "+x.getName()));
	}
}
