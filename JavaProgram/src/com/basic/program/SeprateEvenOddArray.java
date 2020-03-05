package com.basic.program;
public class SeprateEvenOddArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int left = 0, right = a.length - 1;
		while (left < right) {
			while (a[left] % 2 == 0 && left < right) {
				left++;
			}
			while (a[right] % 2 == 1 && left < right) {
				right--;
			}
			if (left < right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
