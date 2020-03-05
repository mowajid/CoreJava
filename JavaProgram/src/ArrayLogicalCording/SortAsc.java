package ArrayLogicalCording;

public class SortAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];

					arr[j] = temp;
				}
			}
		}

		System.out.println("asending");

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}

}
