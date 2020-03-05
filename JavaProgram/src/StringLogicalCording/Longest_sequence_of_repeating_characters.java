package StringLogicalCording;

public class Longest_sequence_of_repeating_characters {

	public int maxRepeating(String str) {
		int len = str.length();
		int count = 0;

		for (int i = 0; i < len; i++) {
			int cur_count = 1;

			for (int j = i + 1; j < len; j++) {

				if (str.charAt(i) == str.charAt(j)) {
					cur_count++;
				}else {
					break;
				}				
			}

			if (cur_count > count) {
				count = cur_count;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Longest_sequence_of_repeating_characters o = new Longest_sequence_of_repeating_characters();
		int result = o.maxRepeating("xxccc");
		System.out.println(result);
	}
}
