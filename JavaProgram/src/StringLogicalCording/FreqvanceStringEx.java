package StringLogicalCording;

public class FreqvanceStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcdabcd";

		System.out.println("find Freqvance ");

		char arr[] = s1.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			int index = i;
			int count = 0;

			for (int j = 0; j < arr.length; j++) {

				if (i > j && arr[i] == arr[j]) {

					break;
				}

				if (arr[index] == arr[j]) {

					count++;
				}
			}

			if (count > 0) {

				System.out.println(arr[i] + "," + count);
			}

		}

	}

}
