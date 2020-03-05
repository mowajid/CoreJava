package com.numbercording;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int even = 0;
		int odd = 0;

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {

				even = even + i;

			}

			if (i % 2 == 1) {

				odd = odd + i;

			}

		}

		System.out.println(even);
		System.out.println(odd);

	}
}
