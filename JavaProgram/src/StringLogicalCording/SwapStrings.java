package StringLogicalCording;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Good";

		String s2 = "Morning";

		System.out.println("befor swaping :" + s1 + " " + s2);

		s1 = s1 + s2;

		s2 = s1.substring(0, (s1.length() - s2.length()));

		s1 = s1.substring(s2.length());

		System.out.println("after swaping :" + s1 + " " + s2);
	}

}
