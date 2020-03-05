package ArrayLogicalCording;

import java.util.HashSet;


// how to remove duplicate value from array

public class RemoveDuplicateInarray {

	public static void main(String[] args) {

		int x[] = { 1, 2, 3, 4, 5, 1, 2, 3 };

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i <x.length; i++) {

			set.add(x[i]);
		}

		for (int no : set) {

			System.out.println(no);
		}

	}

}
