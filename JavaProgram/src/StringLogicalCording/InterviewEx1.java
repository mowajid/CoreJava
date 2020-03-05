package StringLogicalCording;

public class InterviewEx1 {

	public static void main(String[] args) {

		String str1 = new String(); // (str2)cannot be resolved to a variable

		String str2 = new String(str1);
		String str3 = new String(str2);
		String str4 = str1;

		System.out.println(str1 == str2); // f

		System.out.println(str2 == str3); // f
		System.out.println(str4 == str1); // t

		System.out.println(str1.equals(str2)); // t

		System.out.println(str2.equals(str3)); // t

		System.out.println(str4.equals(str1)); //

	}

}
