package StringLogicalCording;

public class CountVowelConsonant {
	
	
	//Java Program to count the total number of vowels and consonants in a string

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Vcount = 0;

		int Ccount = 0;

		String str = " hi java programming ";

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				Vcount++;
			}

			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {

				Ccount++;
			}

		}
		System.out.println("vovels count :" + Vcount);
		System.out.println("consnent count:" + Ccount);
	}

}
