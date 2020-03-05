package com.centuriLink;

public class SortArrayWithoutMethod {
	public static void main(String[] args) {
		int a[] = { 2, 8, 5, 6, 1 };
		/*for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("  "+a[i]);
		}*/

		/// Using Single Loop
		//int a[] = { 45, 78, 22, 96, 10, 87, 68, 2 };
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				a[i] 		= a[i] + a[i - 1];
				a[i - 1] 	= a[i] - a[i - 1];
				a[i] 		= a[i] - a[i - 1];
				i = 0; 
			}
		}
		System.out.print("Sorted array is : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
