package StringLogicalCording;

// find duplicate charator in string

public class FindDuplicateCharatorInString {

	public static void main(String[] args) {

		String str = "wajidbhai";

		int count = 0;

		char[] arr = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {

				if (arr[i] == arr[j]) {

					System.out.println(arr[j]);
					count++;
					break;
				}
			}
		}
	}

}
