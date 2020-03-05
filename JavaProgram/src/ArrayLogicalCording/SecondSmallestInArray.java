package ArrayLogicalCording;

import java.util.Arrays;

public class SecondSmallestInArray {

	public static int SecondSmallestInArray(int a[], int total) {

		Arrays.sort(a);

		return a[1]; // return a[0];
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("SecondSmallestInArray:" + SecondSmallestInArray(a, 6));

	}

}
