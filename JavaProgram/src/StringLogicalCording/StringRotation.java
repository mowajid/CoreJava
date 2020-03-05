package StringLogicalCording;

//Java Program to determine whether one string is a rotation of another

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcde", s2 = "deabc";

		if (s1.length() != s2.length()) {

			System.out.println("not");
		}

		else {

			s1 = s1.concat(s1);

			if (s1.indexOf(s2) != -1)

				System.out.println("yes");

			else

				System.out.println("no");
		}
	}

}
