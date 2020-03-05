package com.functionalinterface;


interface A{
	public int calcullate(int a,int b);
}
public class FunctionalInterface1 {

	public static void main(String[] args) {
		A a=(x,y)->x*y;
		int c=a.calcullate(10, 20);
		System.out.println(c);

	}

}
