package StringLogicalCording;

//Java program to find the duplicate words in a string

public class DuplicateWord {

	public static void main(String[] args) {

		String s1 = "Big Black bug   Big black Dog";

		int count;

		s1 = s1.toLowerCase();

		String words[] = s1.split(" ");

		System.out.println("Duplecte words are:");

		for (int i = 0; i < words.length; i++) {

			count = 1;

			for (int j = i + 1; j < words.length; j++) {

				if (words[i].equals(words[j])) {

					count++;

					words[j] = "0";

				}

			}

			if (count > 1 && words[i] != "0")

				System.out.println(words[i]);
		}
	}

}
