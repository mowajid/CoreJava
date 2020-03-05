package ArrayLogicalCording;

public class Frequency {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 2, 2, 2, 3, 4, 5, 3 };

		int[] arr2 = new int[arr1.length];

		int v = -1;

		for (int i = 0; i < arr1.length; i++) {

			int count = 1;

			for (int j = i + 1; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {

					count++;

					arr2[j] = v;
				}
			}

			if (arr2[i] != v)

				arr2[i] = count;
		}

		for (int i = 0; i < arr2.length; i++) {

			if (arr2[i] != v)

				System.out.println(arr1[i] + "" + arr2[i]);

		}
	}
}