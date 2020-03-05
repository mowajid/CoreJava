package ArrayLogicalCording;

//Program to print the elements of an array present on even position

public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] =  { 1, 2, 3, 4, 5, 6 }; // even position

		for (int i = 1; i < arr.length; i = i + 2) {

			System.out.println(arr[i]);

		}
		System.out.println("------");

		for (int i = 0; i < arr.length; i = i + 2) { // ood position

			System.out.println(arr[i]);
		}

	}
}
