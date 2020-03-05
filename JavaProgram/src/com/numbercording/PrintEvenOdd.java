package com.numbercording;

public class PrintEvenOdd {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

}
