package ArrayLogicalCording;

// how to print max value from array

public class ArrayMxmNumber {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3, 4, 5 };

		int max = x[0];

		for (int i = 0; i < x.length; i++) {

			if (x[i] > max) {

				max = x[i];

			}

		}

		System.out.println(max);

	}

}
