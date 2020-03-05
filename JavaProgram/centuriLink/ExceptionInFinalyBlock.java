package com.centuriLink;

public class ExceptionInFinalyBlock {
	public static void main(String[] args) {
		try {
			int a = 12 / 0;
		} catch (ArithmeticException e) {

		} finally {
			int a = 12 / 0;
			// throw new ArithmeticException();
		}
		System.out.println("This statement wont execute");
	}
}
