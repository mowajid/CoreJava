package com.numbercording;

public class ArmstrongNoEx {

	public static void main(String[] args) {

		int n = 153, r, m = 0, p; // 5*5*5

		p = n;

		while (n > 0) {

			r = n % 10;
			m += r * r * r;
			n = n / 10;

		}
		if (m == p) {
			System.out.println("no is armstrong");
		} else {
			System.out.println("no is not armstrong");
		}
	}

}
