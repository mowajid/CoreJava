package ArrayLogicalCording;

// how to print min value from array

public class ArrayMinNumberEx {

	public static void main(String[] args) {

		int x[] = { 0, 1, 2, 3, 4, 5 };
		int min = x[0];

		for (int i = 1; i < x.length; i++) {

			if (x[i] < min) {

				min = x[i];

			}
		}

		System.out.println(min);
	}

}
