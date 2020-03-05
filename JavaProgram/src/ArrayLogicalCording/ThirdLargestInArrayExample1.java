package ArrayLogicalCording;

import java.util.Arrays;

public class ThirdLargestInArrayExample1 {

	public static int ThirdsLargest(int a[], int total) {

		Arrays.sort(a);

		return a[total - 3];  // return a[total - 2]; return a[total - 1];

	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 10, 20, 30, 40, 50, 60, 70 };

		System.out.println("thirds larges:" + ThirdsLargest(a, 6));

		System.out.println("thirds largest:" + ThirdsLargest(b, 7));
	}

}
