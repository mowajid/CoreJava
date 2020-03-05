package ArrayLogicalCording;

public class OddEvenInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5, 6 };

		System.out.println("even number");

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				System.out.println(a[i]);
			}
		}

		System.out.println("odd number");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 1) {
				System.out.println(a[i]);
			}
		}

	}

}
