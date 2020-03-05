package Mss_Paymets;

public class FizzBuzz {

	public static void main(String[] args) {

		int n = 100;

		for (int i = 1; i < 100; i++) {

			if (i % 3 == 0) {
				System.out.println("Fizz");
			}

			if (i % 5 == 0) {
				System.out.println("Buzz");
			}

			if (i % 3 == 0 && i % 5 == 0) {

				System.out.println("FizzBuzz");
			} else

				System.out.println(i);
		}
	}
}