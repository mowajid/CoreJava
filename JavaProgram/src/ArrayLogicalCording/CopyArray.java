package ArrayLogicalCording;

//Program to copy all elements of one array into another array

public class CopyArray {

	public static void main(String[] args) {

		int[] arr1 =  { 1, 2, 3, 4, 5 };

		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {

			arr2[i] = arr1[i];
		}

		System.out.println("elements of orignal array");
		for (int i = 0; i < arr1.length; i++) {

			System.out.println(arr1[i] + "");
		}

		System.out.println("new array");

		for (int i = 0; i < arr2.length; i++) {

			System.out.println(arr2[i] + "");
		}

	}
}