package StringLogicalCording;

import java.util.Scanner;

public class PlindromStringEx {

	public static void main(String[] args) {

		String reverse = " ";
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String org = sc.nextLine();

		for (int i = org.length() - 1; i >= 0; i--) {

			reverse = reverse + org.charAt(i);

			System.out.println(reverse);
		}

		if (org.equals(reverse)) {
			System.out.println("String are pelindrom");

		} else {
			System.out.println("String are not pelindrom");
		}

	}

}
