package com.numbercording;

public class PrimNumberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i < 100; i++) {

			for (int j = 2; i <= i; j++) {

				if (i == j) {
					System.out.println(i);
				}

				if (i % j == 0) {
					break;
				}
			}

		}

	}

}
